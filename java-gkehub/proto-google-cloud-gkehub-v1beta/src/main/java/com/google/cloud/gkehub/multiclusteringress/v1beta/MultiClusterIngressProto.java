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
// source: google/cloud/gkehub/v1beta/multiclusteringress/multiclusteringress.proto

package com.google.cloud.gkehub.multiclusteringress.v1beta;

public final class MultiClusterIngressProto {
  private MultiClusterIngressProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_multiclusteringress_v1beta_FeatureSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_multiclusteringress_v1beta_FeatureSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nHgoogle/cloud/gkehub/v1beta/multicluste"
          + "ringress/multiclusteringress.proto\022.goog"
          + "le.cloud.gkehub.multiclusteringress.v1be"
          + "ta\"r\n\013FeatureSpec\022\031\n\021config_membership\030\001"
          + " \001(\t\022H\n\007billing\030\002 \001(\01627.google.cloud.gke"
          + "hub.multiclusteringress.v1beta.Billing*I"
          + "\n\007Billing\022\027\n\023BILLING_UNSPECIFIED\020\000\022\021\n\rPA"
          + "Y_AS_YOU_GO\020\001\022\022\n\016ANTHOS_LICENSE\020\002B\312\002\n2co"
          + "m.google.cloud.gkehub.multiclusteringres"
          + "s.v1betaB\030MultiClusterIngressProtoP\001Zago"
          + "ogle.golang.org/genproto/googleapis/clou"
          + "d/gkehub/multiclusteringress/v1beta;mult"
          + "iclusteringress\252\002.Google.Cloud.GkeHub.Mu"
          + "ltiClusterIngress.V1Beta\312\002.Google\\Cloud\\"
          + "GkeHub\\MultiClusterIngress\\V1beta\352\0022Goog"
          + "le::Cloud::GkeHub::MultiClusterIngress::"
          + "V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_gkehub_multiclusteringress_v1beta_FeatureSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkehub_multiclusteringress_v1beta_FeatureSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_multiclusteringress_v1beta_FeatureSpec_descriptor,
            new java.lang.String[] {
              "ConfigMembership", "Billing",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
