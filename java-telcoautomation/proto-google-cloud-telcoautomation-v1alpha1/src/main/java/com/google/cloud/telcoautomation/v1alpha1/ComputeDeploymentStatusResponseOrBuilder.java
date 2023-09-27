/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

package com.google.cloud.telcoautomation.v1alpha1;

public interface ComputeDeploymentStatusResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.ComputeDeploymentStatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the deployment.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the deployment.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Aggregated status of a deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1alpha1.Status status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * Output only. Aggregated status of a deployment.
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1alpha1.Status status = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The status.
   */
  com.google.cloud.telcoautomation.v1alpha1.Status getStatus();

  /**
   *
   *
   * <pre>
   * Output only. Resource level status details in deployments.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.telcoautomation.v1alpha1.ResourceStatus resource_statuses = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.telcoautomation.v1alpha1.ResourceStatus>
      getResourceStatusesList();
  /**
   *
   *
   * <pre>
   * Output only. Resource level status details in deployments.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.telcoautomation.v1alpha1.ResourceStatus resource_statuses = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.telcoautomation.v1alpha1.ResourceStatus getResourceStatuses(int index);
  /**
   *
   *
   * <pre>
   * Output only. Resource level status details in deployments.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.telcoautomation.v1alpha1.ResourceStatus resource_statuses = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getResourceStatusesCount();
  /**
   *
   *
   * <pre>
   * Output only. Resource level status details in deployments.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.telcoautomation.v1alpha1.ResourceStatus resource_statuses = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.telcoautomation.v1alpha1.ResourceStatusOrBuilder>
      getResourceStatusesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Resource level status details in deployments.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.telcoautomation.v1alpha1.ResourceStatus resource_statuses = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.telcoautomation.v1alpha1.ResourceStatusOrBuilder getResourceStatusesOrBuilder(
      int index);
}
