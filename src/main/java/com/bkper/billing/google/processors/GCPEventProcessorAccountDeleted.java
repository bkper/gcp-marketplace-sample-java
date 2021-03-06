package com.bkper.billing.google.processors;

import java.io.IOException;

import com.bkper.billing.google.GCPAccount;
import com.bkper.billing.google.pubsub.GCPPubsubMessageData;
import com.bkper.objectify.Transact;
import com.bkper.user.BkperUser;
import com.googlecode.objectify.TxnType;

public class GCPEventProcessorAccountDeleted extends GCPEventProcessorBase {

    @Override
    @Transact(TxnType.REQUIRED)
    public void processMessage(GCPPubsubMessageData message) throws IOException {
        String gcpAccountId = message.getAccount().getId();
        GCPAccount gcpAccount = gcpAccountRepository.loadById(gcpAccountId);
        if (gcpAccount.getUserId() != null) {
            BkperUser user = registeredUserService.findById(gcpAccount.getUserId());
            billingService.updateBilling(user, null);
        }
        gcpAccountRepository.delete(gcpAccount);
    }

}
