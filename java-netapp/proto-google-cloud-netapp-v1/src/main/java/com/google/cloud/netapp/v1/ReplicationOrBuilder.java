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
// source: google/cloud/netapp/v1/replication.proto

package com.google.cloud.netapp.v1;

public interface ReplicationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.Replication)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the Replication.
   * Format:
   * `projects/{project_id}/locations/{location}/volumes/{volume_id}/replications/{replication_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the Replication.
   * Format:
   * `projects/{project_id}/locations/{location}/volumes/{volume_id}/replications/{replication_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. State of the replication.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.Replication.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the replication.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.Replication.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.netapp.v1.Replication.State getState();

  /**
   *
   *
   * <pre>
   * Output only. State details of the replication.
   * </pre>
   *
   * <code>string state_details = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateDetails.
   */
  java.lang.String getStateDetails();
  /**
   *
   *
   * <pre>
   * Output only. State details of the replication.
   * </pre>
   *
   * <code>string state_details = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateDetails.
   */
  com.google.protobuf.ByteString getStateDetailsBytes();

  /**
   *
   *
   * <pre>
   * Output only. Indicates whether this points to source or destination.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.Replication.ReplicationRole role = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for role.
   */
  int getRoleValue();
  /**
   *
   *
   * <pre>
   * Output only. Indicates whether this points to source or destination.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.Replication.ReplicationRole role = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The role.
   */
  com.google.cloud.netapp.v1.Replication.ReplicationRole getRole();

  /**
   *
   *
   * <pre>
   * Required. Indicates the schedule for replication.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.Replication.ReplicationSchedule replication_schedule = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for replicationSchedule.
   */
  int getReplicationScheduleValue();
  /**
   *
   *
   * <pre>
   * Required. Indicates the schedule for replication.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.Replication.ReplicationSchedule replication_schedule = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The replicationSchedule.
   */
  com.google.cloud.netapp.v1.Replication.ReplicationSchedule getReplicationSchedule();

  /**
   *
   *
   * <pre>
   * Output only. Indicates the state of mirroring.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.Replication.MirrorState mirror_state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for mirrorState.
   */
  int getMirrorStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Indicates the state of mirroring.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.Replication.MirrorState mirror_state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The mirrorState.
   */
  com.google.cloud.netapp.v1.Replication.MirrorState getMirrorState();

  /**
   *
   *
   * <pre>
   * Output only. Condition of the relationship. Can be one of the following:
   * - true: The replication relationship is healthy. It has not missed the most
   * recent scheduled transfer.
   * - false: The replication relationship is not healthy. It has missed the
   * most recent scheduled transfer.
   * </pre>
   *
   * <code>optional bool healthy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the healthy field is set.
   */
  boolean hasHealthy();
  /**
   *
   *
   * <pre>
   * Output only. Condition of the relationship. Can be one of the following:
   * - true: The replication relationship is healthy. It has not missed the most
   * recent scheduled transfer.
   * - false: The replication relationship is not healthy. It has missed the
   * most recent scheduled transfer.
   * </pre>
   *
   * <code>optional bool healthy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The healthy.
   */
  boolean getHealthy();

  /**
   *
   *
   * <pre>
   * Output only. Replication create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Replication create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Replication create time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Full name of destination volume resource.
   * Example : "projects/{project}/locations/{location}/volumes/{volume_id}"
   * </pre>
   *
   * <code>
   * string destination_volume = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The destinationVolume.
   */
  java.lang.String getDestinationVolume();
  /**
   *
   *
   * <pre>
   * Output only. Full name of destination volume resource.
   * Example : "projects/{project}/locations/{location}/volumes/{volume_id}"
   * </pre>
   *
   * <code>
   * string destination_volume = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for destinationVolume.
   */
  com.google.protobuf.ByteString getDestinationVolumeBytes();

  /**
   *
   *
   * <pre>
   * Output only. Replication transfer statistics.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.TransferStats transfer_stats = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the transferStats field is set.
   */
  boolean hasTransferStats();
  /**
   *
   *
   * <pre>
   * Output only. Replication transfer statistics.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.TransferStats transfer_stats = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The transferStats.
   */
  com.google.cloud.netapp.v1.TransferStats getTransferStats();
  /**
   *
   *
   * <pre>
   * Output only. Replication transfer statistics.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.TransferStats transfer_stats = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.netapp.v1.TransferStatsOrBuilder getTransferStatsOrBuilder();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 12;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * A description about this replication relationship.
   * </pre>
   *
   * <code>optional string description = 13;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * A description about this replication relationship.
   * </pre>
   *
   * <code>optional string description = 13;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * A description about this replication relationship.
   * </pre>
   *
   * <code>optional string description = 13;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. Input only. Destination volume parameters
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.DestinationVolumeParameters destination_volume_parameters = 14 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the destinationVolumeParameters field is set.
   */
  boolean hasDestinationVolumeParameters();
  /**
   *
   *
   * <pre>
   * Required. Input only. Destination volume parameters
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.DestinationVolumeParameters destination_volume_parameters = 14 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The destinationVolumeParameters.
   */
  com.google.cloud.netapp.v1.DestinationVolumeParameters getDestinationVolumeParameters();
  /**
   *
   *
   * <pre>
   * Required. Input only. Destination volume parameters
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.DestinationVolumeParameters destination_volume_parameters = 14 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.netapp.v1.DestinationVolumeParametersOrBuilder
      getDestinationVolumeParametersOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Full name of source volume resource.
   * Example : "projects/{project}/locations/{location}/volumes/{volume_id}"
   * </pre>
   *
   * <code>
   * string source_volume = 15 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The sourceVolume.
   */
  java.lang.String getSourceVolume();
  /**
   *
   *
   * <pre>
   * Output only. Full name of source volume resource.
   * Example : "projects/{project}/locations/{location}/volumes/{volume_id}"
   * </pre>
   *
   * <code>
   * string source_volume = 15 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for sourceVolume.
   */
  com.google.protobuf.ByteString getSourceVolumeBytes();
}
