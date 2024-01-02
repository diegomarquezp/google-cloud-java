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
// source: google/cloud/orgpolicy/v2/constraint.proto

package com.google.cloud.orgpolicy.v2;

public final class ConstraintProto {
  private ConstraintProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_Constraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v2_Constraint_ListConstraint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_Constraint_ListConstraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v2_Constraint_BooleanConstraint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_Constraint_BooleanConstraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orgpolicy_v2_CustomConstraint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_CustomConstraint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/orgpolicy/v2/constraint.p"
          + "roto\022\031google.cloud.orgpolicy.v2\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\032\037google/protobuf/timestamp.p"
          + "roto\"\322\005\n\nConstraint\022\022\n\004name\030\001 \001(\tB\004\342A\001\005\022"
          + "\024\n\014display_name\030\002 \001(\t\022\023\n\013description\030\003 \001"
          + "(\t\022S\n\022constraint_default\030\004 \001(\01627.google."
          + "cloud.orgpolicy.v2.Constraint.Constraint"
          + "Default\022O\n\017list_constraint\030\005 \001(\01324.googl"
          + "e.cloud.orgpolicy.v2.Constraint.ListCons"
          + "traintH\000\022U\n\022boolean_constraint\030\006 \001(\01327.g"
          + "oogle.cloud.orgpolicy.v2.Constraint.Bool"
          + "eanConstraintH\000\022\030\n\020supports_dry_run\030\007 \001("
          + "\010\032=\n\016ListConstraint\022\023\n\013supports_in\030\001 \001(\010"
          + "\022\026\n\016supports_under\030\002 \001(\010\032\023\n\021BooleanConst"
          + "raint\"L\n\021ConstraintDefault\022\"\n\036CONSTRAINT"
          + "_DEFAULT_UNSPECIFIED\020\000\022\t\n\005ALLOW\020\001\022\010\n\004DEN"
          + "Y\020\002:\270\001\352A\264\001\n#orgpolicy.googleapis.com/Con"
          + "straint\022+projects/{project}/constraints/"
          + "{constraint}\022)folders/{folder}/constrain"
          + "ts/{constraint}\0225organizations/{organiza"
          + "tion}/constraints/{constraint}B\021\n\017constr"
          + "aint_type\"\327\004\n\020CustomConstraint\022\022\n\004name\030\001"
          + " \001(\tB\004\342A\001\005\022\034\n\016resource_types\030\002 \003(\tB\004\342A\001\005"
          + "\022L\n\014method_types\030\003 \003(\01626.google.cloud.or"
          + "gpolicy.v2.CustomConstraint.MethodType\022\021"
          + "\n\tcondition\030\004 \001(\t\022K\n\013action_type\030\005 \001(\01626"
          + ".google.cloud.orgpolicy.v2.CustomConstra"
          + "int.ActionType\022\024\n\014display_name\030\006 \001(\t\022\023\n\013"
          + "description\030\007 \001(\t\0225\n\013update_time\030\010 \001(\0132\032"
          + ".google.protobuf.TimestampB\004\342A\001\003\"M\n\nMeth"
          + "odType\022\033\n\027METHOD_TYPE_UNSPECIFIED\020\000\022\n\n\006C"
          + "REATE\020\001\022\n\n\006UPDATE\020\002\022\n\n\006DELETE\020\003\">\n\nActio"
          + "nType\022\033\n\027ACTION_TYPE_UNSPECIFIED\020\000\022\t\n\005AL"
          + "LOW\020\001\022\010\n\004DENY\020\002:r\352Ao\n)orgpolicy.googleap"
          + "is.com/CustomConstraint\022Borganizations/{"
          + "organization}/customConstraints/{custom_"
          + "constraint}B\306\001\n\035com.google.cloud.orgpoli"
          + "cy.v2B\017ConstraintProtoP\001Z;cloud.google.c"
          + "om/go/orgpolicy/apiv2/orgpolicypb;orgpol"
          + "icypb\252\002\031Google.Cloud.OrgPolicy.V2\312\002\031Goog"
          + "le\\Cloud\\OrgPolicy\\V2\352\002\034Google::Cloud::O"
          + "rgPolicy::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_orgpolicy_v2_Constraint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "ConstraintDefault",
              "ListConstraint",
              "BooleanConstraint",
              "SupportsDryRun",
              "ConstraintType",
            });
    internal_static_google_cloud_orgpolicy_v2_Constraint_ListConstraint_descriptor =
        internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_orgpolicy_v2_Constraint_ListConstraint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v2_Constraint_ListConstraint_descriptor,
            new java.lang.String[] {
              "SupportsIn", "SupportsUnder",
            });
    internal_static_google_cloud_orgpolicy_v2_Constraint_BooleanConstraint_descriptor =
        internal_static_google_cloud_orgpolicy_v2_Constraint_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_orgpolicy_v2_Constraint_BooleanConstraint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v2_Constraint_BooleanConstraint_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_orgpolicy_v2_CustomConstraint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_orgpolicy_v2_CustomConstraint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orgpolicy_v2_CustomConstraint_descriptor,
            new java.lang.String[] {
              "Name",
              "ResourceTypes",
              "MethodTypes",
              "Condition",
              "ActionType",
              "DisplayName",
              "Description",
              "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
