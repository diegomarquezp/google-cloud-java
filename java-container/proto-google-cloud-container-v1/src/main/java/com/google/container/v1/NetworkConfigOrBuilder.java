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
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface NetworkConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.NetworkConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [network][google.container.v1.NetworkConfig.network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which
   * the cluster is connected.
   * Example: projects/my-project/global/networks/my-network
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [network][google.container.v1.NetworkConfig.network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which
   * the cluster is connected.
   * Example: projects/my-project/global/networks/my-network
   * </pre>
   *
   * <code>string network = 1;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the cluster is connected.
   * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * Output only. The relative name of the Google Compute Engine
   * [subnetwork](https://cloud.google.com/compute/docs/vpc) to which the cluster is connected.
   * Example: projects/my-project/regions/us-central1/subnetworks/my-subnet
   * </pre>
   *
   * <code>string subnetwork = 2;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();

  /**
   *
   *
   * <pre>
   * Whether Intra-node visibility is enabled for this cluster.
   * This makes same node pod to pod traffic visible for VPC network.
   * </pre>
   *
   * <code>bool enable_intra_node_visibility = 5;</code>
   *
   * @return The enableIntraNodeVisibility.
   */
  boolean getEnableIntraNodeVisibility();
}
