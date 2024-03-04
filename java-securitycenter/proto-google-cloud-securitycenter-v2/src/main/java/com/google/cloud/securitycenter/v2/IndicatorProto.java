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
// source: google/cloud/securitycenter/v2/indicator.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.v2;

public final class IndicatorProto {
  private IndicatorProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Indicator_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Indicator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_MemoryHashSignature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_MemoryHashSignature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_MemoryHashSignature_Detection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_MemoryHashSignature_Detection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_YaraRuleSignature_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_YaraRuleSignature_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/securitycenter/v2/indicat"
          + "or.proto\022\036google.cloud.securitycenter.v2"
          + "\"\331\006\n\tIndicator\022\024\n\014ip_addresses\030\001 \003(\t\022\017\n\007"
          + "domains\030\002 \003(\t\022N\n\nsignatures\030\003 \003(\0132:.goog"
          + "le.cloud.securitycenter.v2.Indicator.Pro"
          + "cessSignature\022\014\n\004uris\030\004 \003(\t\032\306\005\n\020ProcessS"
          + "ignature\022o\n\025memory_hash_signature\030\006 \001(\0132"
          + "N.google.cloud.securitycenter.v2.Indicat"
          + "or.ProcessSignature.MemoryHashSignatureH"
          + "\000\022k\n\023yara_rule_signature\030\007 \001(\0132L.google."
          + "cloud.securitycenter.v2.Indicator.Proces"
          + "sSignature.YaraRuleSignatureH\000\022`\n\016signat"
          + "ure_type\030\010 \001(\0162H.google.cloud.securityce"
          + "nter.v2.Indicator.ProcessSignature.Signa"
          + "tureType\032\326\001\n\023MemoryHashSignature\022\025\n\rbina"
          + "ry_family\030\001 \001(\t\022l\n\ndetections\030\004 \003(\0132X.go"
          + "ogle.cloud.securitycenter.v2.Indicator.P"
          + "rocessSignature.MemoryHashSignature.Dete"
          + "ction\032:\n\tDetection\022\016\n\006binary\030\002 \001(\t\022\035\n\025pe"
          + "rcent_pages_matched\030\003 \001(\001\032&\n\021YaraRuleSig"
          + "nature\022\021\n\tyara_rule\030\005 \001(\t\"d\n\rSignatureTy"
          + "pe\022\036\n\032SIGNATURE_TYPE_UNSPECIFIED\020\000\022\032\n\026SI"
          + "GNATURE_TYPE_PROCESS\020\001\022\027\n\023SIGNATURE_TYPE"
          + "_FILE\020\002B\013\n\tsignatureB\350\001\n\"com.google.clou"
          + "d.securitycenter.v2B\016IndicatorProtoP\001ZJc"
          + "loud.google.com/go/securitycenter/apiv2/"
          + "securitycenterpb;securitycenterpb\252\002\036Goog"
          + "le.Cloud.SecurityCenter.V2\312\002\036Google\\Clou"
          + "d\\SecurityCenter\\V2\352\002!Google::Cloud::Sec"
          + "urityCenter::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_securitycenter_v2_Indicator_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_Indicator_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Indicator_descriptor,
            new java.lang.String[] {
              "IpAddresses", "Domains", "Signatures", "Uris",
            });
    internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_descriptor =
        internal_static_google_cloud_securitycenter_v2_Indicator_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_descriptor,
            new java.lang.String[] {
              "MemoryHashSignature", "YaraRuleSignature", "SignatureType", "Signature",
            });
    internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_MemoryHashSignature_descriptor =
        internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_MemoryHashSignature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_MemoryHashSignature_descriptor,
            new java.lang.String[] {
              "BinaryFamily", "Detections",
            });
    internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_MemoryHashSignature_Detection_descriptor =
        internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_MemoryHashSignature_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_MemoryHashSignature_Detection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_MemoryHashSignature_Detection_descriptor,
            new java.lang.String[] {
              "Binary", "PercentPagesMatched",
            });
    internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_YaraRuleSignature_descriptor =
        internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_YaraRuleSignature_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Indicator_ProcessSignature_YaraRuleSignature_descriptor,
            new java.lang.String[] {
              "YaraRule",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
