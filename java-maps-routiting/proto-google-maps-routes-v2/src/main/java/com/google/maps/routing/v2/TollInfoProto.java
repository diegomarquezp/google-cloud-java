/*
 * Copyright 2020 Google LLC
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
// source: google/maps/routing/v2/toll_info.proto

package com.google.maps.routing.v2;

public final class TollInfoProto {
  private TollInfoProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_TollInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_TollInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/maps/routing/v2/toll_info.proto"
          + "\022\026google.maps.routing.v2\032\027google/type/mo"
          + "ney.proto\"7\n\010TollInfo\022+\n\017estimated_price"
          + "\030\001 \003(\0132\022.google.type.MoneyB\305\001\n\032com.googl"
          + "e.maps.routing.v2B\rTollInfoProtoP\001Z=goog"
          + "le.golang.org/genproto/googleapis/maps/r"
          + "outing/v2;routing\370\001\001\242\002\005GMRV2\252\002\026Google.Ma"
          + "ps.Routing.V2\312\002\026Google\\Maps\\Routing\\V2\352\002"
          + "\031Google::Maps::Routing::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.type.MoneyProto.getDescriptor(),
            });
    internal_static_google_maps_routing_v2_TollInfo_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_routing_v2_TollInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_TollInfo_descriptor,
            new java.lang.String[] {
              "EstimatedPrice",
            });
    com.google.type.MoneyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
