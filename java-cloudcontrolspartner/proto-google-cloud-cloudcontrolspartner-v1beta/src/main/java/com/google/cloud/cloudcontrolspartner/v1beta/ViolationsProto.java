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
// source: google/cloud/cloudcontrolspartner/v1beta/violations.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.cloudcontrolspartner.v1beta;

public final class ViolationsProto {
  private ViolationsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_Gcloud_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_Gcloud_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_Console_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_Console_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_ListViolationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_ListViolationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_ListViolationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_ListViolationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_GetViolationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_GetViolationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/cloudcontrolspartner/v1be"
          + "ta/violations.proto\022(google.cloud.cloudc"
          + "ontrolspartner.v1beta\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\032\037google/protobuf/timestamp.proto\032\032goog"
          + "le/type/interval.proto\"\271\r\n\tViolation\022\021\n\004"
          + "name\030\001 \001(\tB\003\340A\010\022\030\n\013description\030\002 \001(\tB\003\340A"
          + "\003\0223\n\nbegin_time\030\003 \001(\0132\032.google.protobuf."
          + "TimestampB\003\340A\003\0224\n\013update_time\030\004 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\003\340A\003\0225\n\014resolve_"
          + "time\030\005 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\022\025\n\010category\030\006 \001(\tB\003\340A\003\022M\n\005state\030\007 \001("
          + "\01629.google.cloud.cloudcontrolspartner.v1"
          + "beta.Violation.StateB\003\340A\003\022(\n\030non_complia"
          + "nt_org_policy\030\010 \001(\tB\006\340A\003\340A\005\022\021\n\tfolder_id"
          + "\030\t \001(\003\022Y\n\013remediation\030\r \001(\0132?.google.clo"
          + "ud.cloudcontrolspartner.v1beta.Violation"
          + ".RemediationB\003\340A\003\032\320\007\n\013Remediation\022g\n\014ins"
          + "tructions\030\001 \001(\0132L.google.cloud.cloudcont"
          + "rolspartner.v1beta.Violation.Remediation"
          + ".InstructionsB\003\340A\002\022\030\n\020compliant_values\030\002"
          + " \003(\t\022n\n\020remediation_type\030\003 \001(\0162O.google."
          + "cloud.cloudcontrolspartner.v1beta.Violat"
          + "ion.Remediation.RemediationTypeB\003\340A\003\032\212\003\n"
          + "\014Instructions\022p\n\023gcloud_instructions\030\001 \001"
          + "(\0132S.google.cloud.cloudcontrolspartner.v"
          + "1beta.Violation.Remediation.Instructions"
          + ".Gcloud\022r\n\024console_instructions\030\002 \001(\0132T."
          + "google.cloud.cloudcontrolspartner.v1beta"
          + ".Violation.Remediation.Instructions.Cons"
          + "ole\032J\n\006Gcloud\022\027\n\017gcloud_commands\030\001 \003(\t\022\r"
          + "\n\005steps\030\002 \003(\t\022\030\n\020additional_links\030\003 \003(\t\032"
          + "H\n\007Console\022\024\n\014console_uris\030\001 \003(\t\022\r\n\005step"
          + "s\030\002 \003(\t\022\030\n\020additional_links\030\003 \003(\t\"\300\002\n\017Re"
          + "mediationType\022 \n\034REMEDIATION_TYPE_UNSPEC"
          + "IFIED\020\000\022,\n(REMEDIATION_BOOLEAN_ORG_POLIC"
          + "Y_VIOLATION\020\001\0228\n4REMEDIATION_LIST_ALLOWE"
          + "D_VALUES_ORG_POLICY_VIOLATION\020\002\0227\n3REMED"
          + "IATION_LIST_DENIED_VALUES_ORG_POLICY_VIO"
          + "LATION\020\003\022F\nBREMEDIATION_RESTRICT_CMEK_CR"
          + "YPTO_KEY_PROJECTS_ORG_POLICY_VIOLATION\020\004"
          + "\022\"\n\036REMEDIATION_RESOURCE_VIOLATION\020\005\"K\n\005"
          + "State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010RESOLVED"
          + "\020\001\022\016\n\nUNRESOLVED\020\002\022\r\n\tEXCEPTION\020\003:\276\001\352A\272\001"
          + "\n-cloudcontrolspartner.googleapis.com/Vi"
          + "olation\022rorganizations/{organization}/lo"
          + "cations/{location}/customers/{customer}/"
          + "workloads/{workload}/violations/{violati"
          + "on}*\nviolations2\tviolation\"\351\001\n\025ListViola"
          + "tionsRequest\022E\n\006parent\030\001 \001(\tB5\340A\002\372A/\022-cl"
          + "oudcontrolspartner.googleapis.com/Violat"
          + "ion\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_toke"
          + "n\030\003 \001(\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\022\025\n\010ord"
          + "er_by\030\005 \001(\tB\003\340A\001\022,\n\010interval\030\006 \001(\0132\025.goo"
          + "gle.type.IntervalB\003\340A\001\"\217\001\n\026ListViolation"
          + "sResponse\022G\n\nviolations\030\001 \003(\01323.google.c"
          + "loud.cloudcontrolspartner.v1beta.Violati"
          + "on\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreachab"
          + "le\030\003 \003(\t\"Z\n\023GetViolationRequest\022C\n\004name\030"
          + "\001 \001(\tB5\340A\002\372A/\n-cloudcontrolspartner.goog"
          + "leapis.com/ViolationB\247\002\n,com.google.clou"
          + "d.cloudcontrolspartner.v1betaB\017Violation"
          + "sProtoP\001Z`cloud.google.com/go/cloudcontr"
          + "olspartner/apiv1beta/cloudcontrolspartne"
          + "rpb;cloudcontrolspartnerpb\252\002(Google.Clou"
          + "d.CloudControlsPartner.V1Beta\312\002(Google\\C"
          + "loud\\CloudControlsPartner\\V1beta\352\002+Googl"
          + "e::Cloud::CloudControlsPartner::V1betab\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.IntervalProto.getDescriptor(),
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "BeginTime",
              "UpdateTime",
              "ResolveTime",
              "Category",
              "State",
              "NonCompliantOrgPolicy",
              "FolderId",
              "Remediation",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_descriptor =
        internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_descriptor,
            new java.lang.String[] {
              "Instructions", "CompliantValues", "RemediationType",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_descriptor =
        internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_descriptor,
            new java.lang.String[] {
              "GcloudInstructions", "ConsoleInstructions",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_Gcloud_descriptor =
        internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_Gcloud_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_Gcloud_descriptor,
            new java.lang.String[] {
              "GcloudCommands", "Steps", "AdditionalLinks",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_Console_descriptor =
        internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_Console_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_Violation_Remediation_Instructions_Console_descriptor,
            new java.lang.String[] {
              "ConsoleUris", "Steps", "AdditionalLinks",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_ListViolationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_ListViolationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_ListViolationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy", "Interval",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_ListViolationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_ListViolationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_ListViolationsResponse_descriptor,
            new java.lang.String[] {
              "Violations", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_GetViolationRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_GetViolationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_GetViolationRequest_descriptor,
            new java.lang.String[] {
              "Name",
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
    com.google.type.IntervalProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
