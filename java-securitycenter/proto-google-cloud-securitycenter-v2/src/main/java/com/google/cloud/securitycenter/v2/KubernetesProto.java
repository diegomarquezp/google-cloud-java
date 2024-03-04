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
// source: google/cloud/securitycenter/v2/kubernetes.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.v2;

public final class KubernetesProto {
  private KubernetesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Kubernetes_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Kubernetes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Kubernetes_Pod_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Kubernetes_Pod_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Kubernetes_Node_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Kubernetes_Node_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Kubernetes_NodePool_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Kubernetes_NodePool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Kubernetes_Role_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Kubernetes_Role_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Kubernetes_Binding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Kubernetes_Binding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Kubernetes_Subject_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Kubernetes_Subject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Kubernetes_AccessReview_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Kubernetes_AccessReview_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Kubernetes_Object_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Kubernetes_Object_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/securitycenter/v2/kuberne"
          + "tes.proto\022\036google.cloud.securitycenter.v"
          + "2\032.google/cloud/securitycenter/v2/contai"
          + "ner.proto\032*google/cloud/securitycenter/v"
          + "2/label.proto\"\202\014\n\nKubernetes\022<\n\004pods\030\001 \003"
          + "(\0132..google.cloud.securitycenter.v2.Kube"
          + "rnetes.Pod\022>\n\005nodes\030\002 \003(\0132/.google.cloud"
          + ".securitycenter.v2.Kubernetes.Node\022G\n\nno"
          + "de_pools\030\003 \003(\01323.google.cloud.securityce"
          + "nter.v2.Kubernetes.NodePool\022>\n\005roles\030\004 \003"
          + "(\0132/.google.cloud.securitycenter.v2.Kube"
          + "rnetes.Role\022D\n\010bindings\030\005 \003(\01322.google.c"
          + "loud.securitycenter.v2.Kubernetes.Bindin"
          + "g\022O\n\016access_reviews\030\006 \003(\01327.google.cloud"
          + ".securitycenter.v2.Kubernetes.AccessRevi"
          + "ew\022B\n\007objects\030\007 \003(\01321.google.cloud.secur"
          + "itycenter.v2.Kubernetes.Object\032\225\001\n\003Pod\022\n"
          + "\n\002ns\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\0225\n\006labels\030\003 \003(\013"
          + "2%.google.cloud.securitycenter.v2.Label\022"
          + "=\n\ncontainers\030\004 \003(\0132).google.cloud.secur"
          + "itycenter.v2.Container\032\024\n\004Node\022\014\n\004name\030\001"
          + " \001(\t\032X\n\010NodePool\022\014\n\004name\030\001 \001(\t\022>\n\005nodes\030"
          + "\002 \003(\0132/.google.cloud.securitycenter.v2.K"
          + "ubernetes.Node\032\236\001\n\004Role\022B\n\004kind\030\001 \001(\01624."
          + "google.cloud.securitycenter.v2.Kubernete"
          + "s.Role.Kind\022\n\n\002ns\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\"8\n"
          + "\004Kind\022\024\n\020KIND_UNSPECIFIED\020\000\022\010\n\004ROLE\020\001\022\020\n"
          + "\014CLUSTER_ROLE\020\002\032\250\001\n\007Binding\022\n\n\002ns\030\001 \001(\t\022"
          + "\014\n\004name\030\002 \001(\t\022=\n\004role\030\003 \001(\0132/.google.clo"
          + "ud.securitycenter.v2.Kubernetes.Role\022D\n\010"
          + "subjects\030\004 \003(\01322.google.cloud.securityce"
          + "nter.v2.Kubernetes.Subject\032\276\001\n\007Subject\022I"
          + "\n\004kind\030\001 \001(\0162;.google.cloud.securitycent"
          + "er.v2.Kubernetes.Subject.AuthType\022\n\n\002ns\030"
          + "\002 \001(\t\022\014\n\004name\030\003 \001(\t\"N\n\010AuthType\022\031\n\025AUTH_"
          + "TYPE_UNSPECIFIED\020\000\022\010\n\004USER\020\001\022\022\n\016SERVICEA"
          + "CCOUNT\020\002\022\t\n\005GROUP\020\003\032}\n\014AccessReview\022\r\n\005g"
          + "roup\030\001 \001(\t\022\n\n\002ns\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\020\n\010"
          + "resource\030\004 \001(\t\022\023\n\013subresource\030\005 \001(\t\022\014\n\004v"
          + "erb\030\006 \001(\t\022\017\n\007version\030\007 \001(\t\032~\n\006Object\022\r\n\005"
          + "group\030\001 \001(\t\022\014\n\004kind\030\002 \001(\t\022\n\n\002ns\030\003 \001(\t\022\014\n"
          + "\004name\030\004 \001(\t\022=\n\ncontainers\030\005 \003(\0132).google"
          + ".cloud.securitycenter.v2.ContainerB\351\001\n\"c"
          + "om.google.cloud.securitycenter.v2B\017Kuber"
          + "netesProtoP\001ZJcloud.google.com/go/securi"
          + "tycenter/apiv2/securitycenterpb;security"
          + "centerpb\252\002\036Google.Cloud.SecurityCenter.V"
          + "2\312\002\036Google\\Cloud\\SecurityCenter\\V2\352\002!Goo"
          + "gle::Cloud::SecurityCenter::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.securitycenter.v2.ContainerProto.getDescriptor(),
              com.google.cloud.securitycenter.v2.LabelProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v2_Kubernetes_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_Kubernetes_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Kubernetes_descriptor,
            new java.lang.String[] {
              "Pods", "Nodes", "NodePools", "Roles", "Bindings", "AccessReviews", "Objects",
            });
    internal_static_google_cloud_securitycenter_v2_Kubernetes_Pod_descriptor =
        internal_static_google_cloud_securitycenter_v2_Kubernetes_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v2_Kubernetes_Pod_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Kubernetes_Pod_descriptor,
            new java.lang.String[] {
              "Ns", "Name", "Labels", "Containers",
            });
    internal_static_google_cloud_securitycenter_v2_Kubernetes_Node_descriptor =
        internal_static_google_cloud_securitycenter_v2_Kubernetes_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_securitycenter_v2_Kubernetes_Node_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Kubernetes_Node_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_securitycenter_v2_Kubernetes_NodePool_descriptor =
        internal_static_google_cloud_securitycenter_v2_Kubernetes_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_securitycenter_v2_Kubernetes_NodePool_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Kubernetes_NodePool_descriptor,
            new java.lang.String[] {
              "Name", "Nodes",
            });
    internal_static_google_cloud_securitycenter_v2_Kubernetes_Role_descriptor =
        internal_static_google_cloud_securitycenter_v2_Kubernetes_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_securitycenter_v2_Kubernetes_Role_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Kubernetes_Role_descriptor,
            new java.lang.String[] {
              "Kind", "Ns", "Name",
            });
    internal_static_google_cloud_securitycenter_v2_Kubernetes_Binding_descriptor =
        internal_static_google_cloud_securitycenter_v2_Kubernetes_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_securitycenter_v2_Kubernetes_Binding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Kubernetes_Binding_descriptor,
            new java.lang.String[] {
              "Ns", "Name", "Role", "Subjects",
            });
    internal_static_google_cloud_securitycenter_v2_Kubernetes_Subject_descriptor =
        internal_static_google_cloud_securitycenter_v2_Kubernetes_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_securitycenter_v2_Kubernetes_Subject_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Kubernetes_Subject_descriptor,
            new java.lang.String[] {
              "Kind", "Ns", "Name",
            });
    internal_static_google_cloud_securitycenter_v2_Kubernetes_AccessReview_descriptor =
        internal_static_google_cloud_securitycenter_v2_Kubernetes_descriptor
            .getNestedTypes()
            .get(6);
    internal_static_google_cloud_securitycenter_v2_Kubernetes_AccessReview_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Kubernetes_AccessReview_descriptor,
            new java.lang.String[] {
              "Group", "Ns", "Name", "Resource", "Subresource", "Verb", "Version",
            });
    internal_static_google_cloud_securitycenter_v2_Kubernetes_Object_descriptor =
        internal_static_google_cloud_securitycenter_v2_Kubernetes_descriptor
            .getNestedTypes()
            .get(7);
    internal_static_google_cloud_securitycenter_v2_Kubernetes_Object_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Kubernetes_Object_descriptor,
            new java.lang.String[] {
              "Group", "Kind", "Ns", "Name", "Containers",
            });
    com.google.cloud.securitycenter.v2.ContainerProto.getDescriptor();
    com.google.cloud.securitycenter.v2.LabelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
