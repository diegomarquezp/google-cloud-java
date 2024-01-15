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
// source: google/api/logging.proto

package com.google.api;

public final class LoggingProto {
  private LoggingProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_Logging_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Logging_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_Logging_LoggingDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Logging_LoggingDestination_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\030google/api/logging.proto\022\ngoogle.api\"\327"
          + "\001\n\007Logging\022E\n\025producer_destinations\030\001 \003("
          + "\0132&.google.api.Logging.LoggingDestinatio"
          + "n\022E\n\025consumer_destinations\030\002 \003(\0132&.googl"
          + "e.api.Logging.LoggingDestination\032>\n\022Logg"
          + "ingDestination\022\032\n\022monitored_resource\030\003 \001"
          + "(\t\022\014\n\004logs\030\001 \003(\tBn\n\016com.google.apiB\014Logg"
          + "ingProtoP\001ZEgoogle.golang.org/genproto/g"
          + "oogleapis/api/serviceconfig;serviceconfi"
          + "g\242\002\004GAPIb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_api_Logging_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Logging_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_Logging_descriptor,
            new java.lang.String[] {
              "ProducerDestinations", "ConsumerDestinations",
            });
    internal_static_google_api_Logging_LoggingDestination_descriptor =
        internal_static_google_api_Logging_descriptor.getNestedTypes().get(0);
    internal_static_google_api_Logging_LoggingDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_Logging_LoggingDestination_descriptor,
            new java.lang.String[] {
              "MonitoredResource", "Logs",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
