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
// source: google/cloud/securitycenter/v2/notification_message.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.v2;

public final class NotificationMessageProto {
  private NotificationMessageProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_NotificationMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_NotificationMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/securitycenter/v2/notific"
          + "ation_message.proto\022\036google.cloud.securi"
          + "tycenter.v2\032,google/cloud/securitycenter"
          + "/v2/finding.proto\032-google/cloud/security"
          + "center/v2/resource.proto\"\270\001\n\023Notificatio"
          + "nMessage\022 \n\030notification_config_name\030\001 \001"
          + "(\t\022:\n\007finding\030\002 \001(\0132\'.google.cloud.secur"
          + "itycenter.v2.FindingH\000\022:\n\010resource\030\003 \001(\013"
          + "2(.google.cloud.securitycenter.v2.Resour"
          + "ceB\007\n\005eventB\362\001\n\"com.google.cloud.securit"
          + "ycenter.v2B\030NotificationMessageProtoP\001ZJ"
          + "cloud.google.com/go/securitycenter/apiv2"
          + "/securitycenterpb;securitycenterpb\252\002\036Goo"
          + "gle.Cloud.SecurityCenter.V2\312\002\036Google\\Clo"
          + "ud\\SecurityCenter\\V2\352\002!Google::Cloud::Se"
          + "curityCenter::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.securitycenter.v2.FindingProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v2_NotificationMessage_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_NotificationMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_NotificationMessage_descriptor,
            new java.lang.String[] {
              "NotificationConfigName", "Finding", "Resource", "Event",
            });
    com.google.cloud.securitycenter.v2.FindingProto.getDescriptor();
    com.google.cloud.securitycenter.v2.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
