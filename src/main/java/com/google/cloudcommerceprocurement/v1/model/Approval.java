/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.cloudcommerceprocurement.v1.model;

/**
 * An approval for some action on an account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Commerce Partner Procurement API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Approval extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The name of the approval.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. An explanation for the state of the approval.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * Output only. The state of the approval.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Optional. The last update timestamp of the approval.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The name of the approval.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of the approval.
   * @param name name or {@code null} for none
   */
  public Approval setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. An explanation for the state of the approval.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * Output only. An explanation for the state of the approval.
   * @param reason reason or {@code null} for none
   */
  public Approval setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Output only. The state of the approval.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the approval.
   * @param state state or {@code null} for none
   */
  public Approval setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Optional. The last update timestamp of the approval.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Optional. The last update timestamp of the approval.
   * @param updateTime updateTime or {@code null} for none
   */
  public Approval setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Approval set(String fieldName, Object value) {
    return (Approval) super.set(fieldName, value);
  }

  @Override
  public Approval clone() {
    return (Approval) super.clone();
  }

}
