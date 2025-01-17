/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/discoveryengine/v1alpha/import_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1alpha;

public final class ImportConfigProto {
  private ImportConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_BigQuerySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_BigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportErrorConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportErrorConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_InlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_InlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/discoveryengine/v1alpha/i"
          + "mport_config.proto\022$google.cloud.discove"
          + "ryengine.v1alpha\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\0323go"
          + "ogle/cloud/discoveryengine/v1alpha/docum"
          + "ent.proto\0325google/cloud/discoveryengine/"
          + "v1alpha/user_event.proto\032\037google/protobu"
          + "f/timestamp.proto\032\027google/rpc/status.pro"
          + "to\032\026google/type/date.proto\"9\n\tGcsSource\022"
          + "\027\n\ninput_uris\030\001 \003(\tB\003\340A\002\022\023\n\013data_schema\030"
          + "\002 \001(\t\"\274\001\n\016BigQuerySource\022+\n\016partition_da"
          + "te\030\005 \001(\0132\021.google.type.DateH\000\022\022\n\nproject"
          + "_id\030\001 \001(\t\022\027\n\ndataset_id\030\002 \001(\tB\003\340A\002\022\025\n\010ta"
          + "ble_id\030\003 \001(\tB\003\340A\002\022\027\n\017gcs_staging_dir\030\004 \001"
          + "(\t\022\023\n\013data_schema\030\006 \001(\tB\013\n\tpartition\"8\n\021"
          + "ImportErrorConfig\022\024\n\ngcs_prefix\030\001 \001(\tH\000B"
          + "\r\n\013destination\"\214\004\n\027ImportUserEventsReque"
          + "st\022c\n\rinline_source\030\002 \001(\0132J.google.cloud"
          + ".discoveryengine.v1alpha.ImportUserEvent"
          + "sRequest.InlineSourceH\000\022E\n\ngcs_source\030\003 "
          + "\001(\0132/.google.cloud.discoveryengine.v1alp"
          + "ha.GcsSourceH\000\022O\n\017bigquery_source\030\004 \001(\0132"
          + "4.google.cloud.discoveryengine.v1alpha.B"
          + "igQuerySourceH\000\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\n"
          + "(discoveryengine.googleapis.com/DataStor"
          + "e\022M\n\014error_config\030\005 \001(\01327.google.cloud.d"
          + "iscoveryengine.v1alpha.ImportErrorConfig"
          + "\032Y\n\014InlineSource\022I\n\013user_events\030\001 \003(\0132/."
          + "google.cloud.discoveryengine.v1alpha.Use"
          + "rEventB\003\340A\002B\010\n\006source\"\320\001\n\030ImportUserEven"
          + "tsResponse\022)\n\rerror_samples\030\001 \003(\0132\022.goog"
          + "le.rpc.Status\022M\n\014error_config\030\002 \001(\01327.go"
          + "ogle.cloud.discoveryengine.v1alpha.Impor"
          + "tErrorConfig\022\033\n\023joined_events_count\030\003 \001("
          + "\003\022\035\n\025unjoined_events_count\030\004 \001(\003\"\252\001\n\030Imp"
          + "ortUserEventsMetadata\022/\n\013create_time\030\001 \001"
          + "(\0132\032.google.protobuf.Timestamp\022/\n\013update"
          + "_time\030\002 \001(\0132\032.google.protobuf.Timestamp\022"
          + "\025\n\rsuccess_count\030\003 \001(\003\022\025\n\rfailure_count\030"
          + "\004 \001(\003\"\251\001\n\027ImportDocumentsMetadata\022/\n\013cre"
          + "ate_time\030\001 \001(\0132\032.google.protobuf.Timesta"
          + "mp\022/\n\013update_time\030\002 \001(\0132\032.google.protobu"
          + "f.Timestamp\022\025\n\rsuccess_count\030\003 \001(\003\022\025\n\rfa"
          + "ilure_count\030\004 \001(\003\"\365\005\n\026ImportDocumentsReq"
          + "uest\022b\n\rinline_source\030\002 \001(\0132I.google.clo"
          + "ud.discoveryengine.v1alpha.ImportDocumen"
          + "tsRequest.InlineSourceH\000\022E\n\ngcs_source\030\003"
          + " \001(\0132/.google.cloud.discoveryengine.v1al"
          + "pha.GcsSourceH\000\022O\n\017bigquery_source\030\004 \001(\013"
          + "24.google.cloud.discoveryengine.v1alpha."
          + "BigQuerySourceH\000\022=\n\006parent\030\001 \001(\tB-\340A\002\372A\'"
          + "\n%discoveryengine.googleapis.com/Branch\022"
          + "M\n\014error_config\030\005 \001(\01327.google.cloud.dis"
          + "coveryengine.v1alpha.ImportErrorConfig\022l"
          + "\n\023reconciliation_mode\030\006 \001(\0162O.google.clo"
          + "ud.discoveryengine.v1alpha.ImportDocumen"
          + "tsRequest.ReconciliationMode\022\031\n\021auto_gen"
          + "erate_ids\030\010 \001(\010\022\020\n\010id_field\030\t \001(\t\032V\n\014Inl"
          + "ineSource\022F\n\tdocuments\030\001 \003(\0132..google.cl"
          + "oud.discoveryengine.v1alpha.DocumentB\003\340A"
          + "\002\"T\n\022ReconciliationMode\022#\n\037RECONCILIATIO"
          + "N_MODE_UNSPECIFIED\020\000\022\017\n\013INCREMENTAL\020\001\022\010\n"
          + "\004FULL\020\002B\010\n\006source\"\223\001\n\027ImportDocumentsRes"
          + "ponse\022)\n\rerror_samples\030\001 \003(\0132\022.google.rp"
          + "c.Status\022M\n\014error_config\030\002 \001(\01327.google."
          + "cloud.discoveryengine.v1alpha.ImportErro"
          + "rConfigB\235\002\n(com.google.cloud.discoveryen"
          + "gine.v1alphaB\021ImportConfigProtoP\001ZRcloud"
          + ".google.com/go/discoveryengine/apiv1alph"
          + "a/discoveryenginepb;discoveryenginepb\242\002\017"
          + "DISCOVERYENGINE\252\002$Google.Cloud.Discovery"
          + "Engine.V1Alpha\312\002$Google\\Cloud\\DiscoveryE"
          + "ngine\\V1alpha\352\002\'Google::Cloud::Discovery"
          + "Engine::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.DocumentProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.UserEventProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_GcsSource_descriptor,
            new java.lang.String[] {
              "InputUris", "DataSchema",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_BigQuerySource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_BigQuerySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_BigQuerySource_descriptor,
            new java.lang.String[] {
              "PartitionDate",
              "ProjectId",
              "DatasetId",
              "TableId",
              "GcsStagingDir",
              "DataSchema",
              "Partition",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportErrorConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportErrorConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportErrorConfig_descriptor,
            new java.lang.String[] {
              "GcsPrefix", "Destination",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_descriptor,
            new java.lang.String[] {
              "InlineSource", "GcsSource", "BigquerySource", "Parent", "ErrorConfig", "Source",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_InlineSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_InlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_InlineSource_descriptor,
            new java.lang.String[] {
              "UserEvents",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorConfig", "JoinedEventsCount", "UnjoinedEventsCount",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime", "SuccessCount", "FailureCount",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime", "SuccessCount", "FailureCount",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_descriptor,
            new java.lang.String[] {
              "InlineSource",
              "GcsSource",
              "BigquerySource",
              "Parent",
              "ErrorConfig",
              "ReconciliationMode",
              "AutoGenerateIds",
              "IdField",
              "Source",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_InlineSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_InlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_InlineSource_descriptor,
            new java.lang.String[] {
              "Documents",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorConfig",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.DocumentProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.UserEventProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
