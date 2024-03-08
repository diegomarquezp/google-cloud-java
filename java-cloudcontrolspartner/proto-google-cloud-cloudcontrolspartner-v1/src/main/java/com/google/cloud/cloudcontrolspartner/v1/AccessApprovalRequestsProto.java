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
// source: google/cloud/cloudcontrolspartner/v1/access_approval_requests.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.cloudcontrolspartner.v1;

public final class AccessApprovalRequestsProto {
  private AccessApprovalRequestsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1_AccessApprovalRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1_AccessApprovalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1_ListAccessApprovalRequestsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1_ListAccessApprovalRequestsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1_ListAccessApprovalRequestsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1_ListAccessApprovalRequestsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1_AccessReason_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1_AccessReason_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/cloud/cloudcontrolspartner/v1/a"
          + "ccess_approval_requests.proto\022$google.cl"
          + "oud.cloudcontrolspartner.v1\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\032\037google/protobuf/timestamp.proto"
          + "\"\351\003\n\025AccessApprovalRequest\022\021\n\004name\030\001 \001(\t"
          + "B\003\340A\010\0220\n\014request_time\030\002 \001(\0132\032.google.pro"
          + "tobuf.Timestamp\022L\n\020requested_reason\030\003 \001("
          + "\01322.google.cloud.cloudcontrolspartner.v1"
          + ".AccessReason\022=\n\031requested_expiration_ti"
          + "me\030\004 \001(\0132\032.google.protobuf.Timestamp:\375\001\352"
          + "A\371\001\n9cloudcontrolspartner.googleapis.com"
          + "/AccessApprovalRequest\022\214\001organizations/{"
          + "organization}/locations/{location}/custo"
          + "mers/{customer}/workloads/{workload}/acc"
          + "essApprovalRequests/{access_approval_req"
          + "uest}*\026accessApprovalRequests2\025accessApp"
          + "rovalRequest\"\323\001\n!ListAccessApprovalReque"
          + "stsRequest\022Q\n\006parent\030\001 \001(\tBA\340A\002\372A;\0229clou"
          + "dcontrolspartner.googleapis.com/AccessAp"
          + "provalRequest\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n"
          + "\npage_token\030\003 \001(\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003"
          + "\340A\001\022\025\n\010order_by\030\005 \001(\tB\003\340A\001\"\261\001\n\"ListAcces"
          + "sApprovalRequestsResponse\022]\n\030access_appr"
          + "oval_requests\030\001 \003(\0132;.google.cloud.cloud"
          + "controlspartner.v1.AccessApprovalRequest"
          + "\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreachable"
          + "\030\003 \003(\t\"\302\002\n\014AccessReason\022E\n\004type\030\001 \001(\01627."
          + "google.cloud.cloudcontrolspartner.v1.Acc"
          + "essReason.Type\022\016\n\006detail\030\002 \001(\t\"\332\001\n\004Type\022"
          + "\024\n\020TYPE_UNSPECIFIED\020\000\022\036\n\032CUSTOMER_INITIA"
          + "TED_SUPPORT\020\001\022\034\n\030GOOGLE_INITIATED_SERVIC"
          + "E\020\002\022\033\n\027GOOGLE_INITIATED_REVIEW\020\003\022\034\n\030THIR"
          + "D_PARTY_DATA_REQUEST\020\004\022\'\n#GOOGLE_RESPONS"
          + "E_TO_PRODUCTION_ALERT\020\005\022\032\n\026CLOUD_INITIAT"
          + "ED_ACCESS\020\006B\237\002\n(com.google.cloud.cloudco"
          + "ntrolspartner.v1B\033AccessApprovalRequests"
          + "ProtoP\001Z\\cloud.google.com/go/cloudcontro"
          + "lspartner/apiv1/cloudcontrolspartnerpb;c"
          + "loudcontrolspartnerpb\252\002$Google.Cloud.Clo"
          + "udControlsPartner.V1\312\002$Google\\Cloud\\Clou"
          + "dControlsPartner\\V1\352\002\'Google::Cloud::Clo"
          + "udControlsPartner::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_cloudcontrolspartner_v1_AccessApprovalRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_cloudcontrolspartner_v1_AccessApprovalRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1_AccessApprovalRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestTime", "RequestedReason", "RequestedExpirationTime",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1_ListAccessApprovalRequestsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_cloudcontrolspartner_v1_ListAccessApprovalRequestsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1_ListAccessApprovalRequestsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1_ListAccessApprovalRequestsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_cloudcontrolspartner_v1_ListAccessApprovalRequestsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1_ListAccessApprovalRequestsResponse_descriptor,
            new java.lang.String[] {
              "AccessApprovalRequests", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1_AccessReason_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_cloudcontrolspartner_v1_AccessReason_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1_AccessReason_descriptor,
            new java.lang.String[] {
              "Type", "Detail",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
