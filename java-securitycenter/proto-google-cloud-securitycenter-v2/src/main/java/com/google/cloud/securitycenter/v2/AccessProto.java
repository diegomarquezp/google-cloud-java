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
// source: google/cloud/securitycenter/v2/access.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.v2;

public final class AccessProto {
  private AccessProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Access_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Access_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_ServiceAccountDelegationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_ServiceAccountDelegationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Geolocation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Geolocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/securitycenter/v2/access."
          + "proto\022\036google.cloud.securitycenter.v2\"\211\003"
          + "\n\006Access\022\027\n\017principal_email\030\001 \001(\t\022\021\n\tcal"
          + "ler_ip\030\002 \001(\t\022B\n\rcaller_ip_geo\030\003 \001(\0132+.go"
          + "ogle.cloud.securitycenter.v2.Geolocation"
          + "\022\031\n\021user_agent_family\030\004 \001(\t\022\022\n\nuser_agen"
          + "t\030\005 \001(\t\022\024\n\014service_name\030\006 \001(\t\022\023\n\013method_"
          + "name\030\007 \001(\t\022\031\n\021principal_subject\030\010 \001(\t\022 \n"
          + "\030service_account_key_name\030\t \001(\t\022e\n\037servi"
          + "ce_account_delegation_info\030\n \003(\0132<.googl"
          + "e.cloud.securitycenter.v2.ServiceAccount"
          + "DelegationInfo\022\021\n\tuser_name\030\013 \001(\t\"R\n\034Ser"
          + "viceAccountDelegationInfo\022\027\n\017principal_e"
          + "mail\030\001 \001(\t\022\031\n\021principal_subject\030\002 \001(\t\"\"\n"
          + "\013Geolocation\022\023\n\013region_code\030\001 \001(\tB\345\001\n\"co"
          + "m.google.cloud.securitycenter.v2B\013Access"
          + "ProtoP\001ZJcloud.google.com/go/securitycen"
          + "ter/apiv2/securitycenterpb;securitycente"
          + "rpb\252\002\036Google.Cloud.SecurityCenter.V2\312\002\036G"
          + "oogle\\Cloud\\SecurityCenter\\V2\352\002!Google::"
          + "Cloud::SecurityCenter::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_securitycenter_v2_Access_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_Access_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Access_descriptor,
            new java.lang.String[] {
              "PrincipalEmail",
              "CallerIp",
              "CallerIpGeo",
              "UserAgentFamily",
              "UserAgent",
              "ServiceName",
              "MethodName",
              "PrincipalSubject",
              "ServiceAccountKeyName",
              "ServiceAccountDelegationInfo",
              "UserName",
            });
    internal_static_google_cloud_securitycenter_v2_ServiceAccountDelegationInfo_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_securitycenter_v2_ServiceAccountDelegationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_ServiceAccountDelegationInfo_descriptor,
            new java.lang.String[] {
              "PrincipalEmail", "PrincipalSubject",
            });
    internal_static_google_cloud_securitycenter_v2_Geolocation_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_securitycenter_v2_Geolocation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Geolocation_descriptor,
            new java.lang.String[] {
              "RegionCode",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
