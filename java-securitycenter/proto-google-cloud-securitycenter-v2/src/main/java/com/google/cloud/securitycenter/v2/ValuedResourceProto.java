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
// source: google/cloud/securitycenter/v2/valued_resource.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.v2;

public final class ValuedResourceProto {
  private ValuedResourceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_ValuedResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_ValuedResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_ResourceValueConfigMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_ResourceValueConfigMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/securitycenter/v2/valued_"
          + "resource.proto\022\036google.cloud.securitycen"
          + "ter.v2\032\031google/api/resource.proto\"\330\004\n\016Va"
          + "luedResource\022\014\n\004name\030\001 \001(\t\022\020\n\010resource\030\002"
          + " \001(\t\022\025\n\rresource_type\030\003 \001(\t\022\024\n\014display_n"
          + "ame\030\004 \001(\t\022T\n\016resource_value\030\005 \001(\0162<.goog"
          + "le.cloud.securitycenter.v2.ValuedResourc"
          + "e.ResourceValue\022\025\n\rexposed_score\030\006 \001(\001\022`"
          + "\n\033resource_value_configs_used\030\007 \003(\0132;.go"
          + "ogle.cloud.securitycenter.v2.ResourceVal"
          + "ueConfigMetadata\"{\n\rResourceValue\022\036\n\032RES"
          + "OURCE_VALUE_UNSPECIFIED\020\000\022\026\n\022RESOURCE_VA"
          + "LUE_LOW\020\001\022\031\n\025RESOURCE_VALUE_MEDIUM\020\002\022\027\n\023"
          + "RESOURCE_VALUE_HIGH\020\003:\254\001\352A\250\001\n,securityce"
          + "nter.googleapis.com/ValuedResource\022Worga"
          + "nizations/{organization}/simulations/{si"
          + "mulation}/valuedResources/{valued_resour"
          + "ce}*\017valuedResources2\016valuedResource\"+\n\033"
          + "ResourceValueConfigMetadata\022\014\n\004name\030\001 \001("
          + "\tB\355\001\n\"com.google.cloud.securitycenter.v2"
          + "B\023ValuedResourceProtoP\001ZJcloud.google.co"
          + "m/go/securitycenter/apiv2/securitycenter"
          + "pb;securitycenterpb\252\002\036Google.Cloud.Secur"
          + "ityCenter.V2\312\002\036Google\\Cloud\\SecurityCent"
          + "er\\V2\352\002!Google::Cloud::SecurityCenter::V"
          + "2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v2_ValuedResource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_ValuedResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_ValuedResource_descriptor,
            new java.lang.String[] {
              "Name",
              "Resource",
              "ResourceType",
              "DisplayName",
              "ResourceValue",
              "ExposedScore",
              "ResourceValueConfigsUsed",
            });
    internal_static_google_cloud_securitycenter_v2_ResourceValueConfigMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_securitycenter_v2_ResourceValueConfigMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_ResourceValueConfigMetadata_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
