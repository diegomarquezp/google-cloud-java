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
// source: google/api/policy.proto

package com.google.api;

public final class PolicyProto {
  private PolicyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.api.PolicyProto.fieldPolicy);
    registry.add(com.google.api.PolicyProto.methodPolicy);
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static final int FIELD_POLICY_FIELD_NUMBER = 158361448;
  /**
   *
   *
   * <pre>
   * See [FieldPolicy][].
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.FieldOptions, com.google.api.FieldPolicy>
      fieldPolicy =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              com.google.api.FieldPolicy.class, com.google.api.FieldPolicy.getDefaultInstance());

  public static final int METHOD_POLICY_FIELD_NUMBER = 161893301;
  /**
   *
   *
   * <pre>
   * See [MethodPolicy][].
   * </pre>
   *
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.MethodOptions, com.google.api.MethodPolicy>
      methodPolicy =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              com.google.api.MethodPolicy.class, com.google.api.MethodPolicy.getDefaultInstance());

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_FieldPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_FieldPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_MethodPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MethodPolicy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\027google/api/policy.proto\022\ngoogle.api\032 g"
          + "oogle/protobuf/descriptor.proto\"S\n\013Field"
          + "Policy\022\020\n\010selector\030\001 \001(\t\022\033\n\023resource_per"
          + "mission\030\002 \001(\t\022\025\n\rresource_type\030\003 \001(\t\"S\n\014"
          + "MethodPolicy\022\020\n\010selector\030\t \001(\t\0221\n\020reques"
          + "t_policies\030\002 \003(\0132\027.google.api.FieldPolic"
          + "y:O\n\014field_policy\022\035.google.protobuf.Fiel"
          + "dOptions\030\350\316\301K \001(\0132\027.google.api.FieldPoli"
          + "cy:R\n\rmethod_policy\022\036.google.protobuf.Me"
          + "thodOptions\030\265\227\231M \001(\0132\030.google.api.Method"
          + "PolicyBp\n\016com.google.apiB\013PolicyProtoP\001Z"
          + "Egoogle.golang.org/genproto/googleapis/a"
          + "pi/serviceconfig;serviceconfig\370\001\001\242\002\004GAPI"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DescriptorProtos.getDescriptor(),
            });
    internal_static_google_api_FieldPolicy_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_FieldPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_FieldPolicy_descriptor,
            new java.lang.String[] {
              "Selector", "ResourcePermission", "ResourceType",
            });
    internal_static_google_api_MethodPolicy_descriptor = getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_MethodPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_MethodPolicy_descriptor,
            new java.lang.String[] {
              "Selector", "RequestPolicies",
            });
    fieldPolicy.internalInit(descriptor.getExtensions().get(0));
    methodPolicy.internalInit(descriptor.getExtensions().get(1));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
