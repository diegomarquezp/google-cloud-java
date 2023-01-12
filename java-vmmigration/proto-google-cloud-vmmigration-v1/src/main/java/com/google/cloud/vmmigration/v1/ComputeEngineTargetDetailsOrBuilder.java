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
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

public interface ComputeEngineTargetDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.ComputeEngineTargetDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the VM to create.
   * </pre>
   *
   * <code>string vm_name = 1;</code>
   *
   * @return The vmName.
   */
  java.lang.String getVmName();
  /**
   *
   *
   * <pre>
   * The name of the VM to create.
   * </pre>
   *
   * <code>string vm_name = 1;</code>
   *
   * @return The bytes for vmName.
   */
  com.google.protobuf.ByteString getVmNameBytes();

  /**
   *
   *
   * <pre>
   * The Google Cloud target project ID or project name.
   * </pre>
   *
   * <code>string project = 2;</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * The Google Cloud target project ID or project name.
   * </pre>
   *
   * <code>string project = 2;</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * The zone in which to create the VM.
   * </pre>
   *
   * <code>string zone = 3;</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * The zone in which to create the VM.
   * </pre>
   *
   * <code>string zone = 3;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * The machine type series to create the VM with.
   * </pre>
   *
   * <code>string machine_type_series = 4;</code>
   *
   * @return The machineTypeSeries.
   */
  java.lang.String getMachineTypeSeries();
  /**
   *
   *
   * <pre>
   * The machine type series to create the VM with.
   * </pre>
   *
   * <code>string machine_type_series = 4;</code>
   *
   * @return The bytes for machineTypeSeries.
   */
  com.google.protobuf.ByteString getMachineTypeSeriesBytes();

  /**
   *
   *
   * <pre>
   * The machine type to create the VM with.
   * </pre>
   *
   * <code>string machine_type = 5;</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * The machine type to create the VM with.
   * </pre>
   *
   * <code>string machine_type = 5;</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * A map of network tags to associate with the VM.
   * </pre>
   *
   * <code>repeated string network_tags = 6;</code>
   *
   * @return A list containing the networkTags.
   */
  java.util.List<java.lang.String> getNetworkTagsList();
  /**
   *
   *
   * <pre>
   * A map of network tags to associate with the VM.
   * </pre>
   *
   * <code>repeated string network_tags = 6;</code>
   *
   * @return The count of networkTags.
   */
  int getNetworkTagsCount();
  /**
   *
   *
   * <pre>
   * A map of network tags to associate with the VM.
   * </pre>
   *
   * <code>repeated string network_tags = 6;</code>
   *
   * @param index The index of the element to return.
   * @return The networkTags at the given index.
   */
  java.lang.String getNetworkTags(int index);
  /**
   *
   *
   * <pre>
   * A map of network tags to associate with the VM.
   * </pre>
   *
   * <code>repeated string network_tags = 6;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the networkTags at the given index.
   */
  com.google.protobuf.ByteString getNetworkTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * List of NICs connected to this VM.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.NetworkInterface network_interfaces = 7;</code>
   */
  java.util.List<com.google.cloud.vmmigration.v1.NetworkInterface> getNetworkInterfacesList();
  /**
   *
   *
   * <pre>
   * List of NICs connected to this VM.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.NetworkInterface network_interfaces = 7;</code>
   */
  com.google.cloud.vmmigration.v1.NetworkInterface getNetworkInterfaces(int index);
  /**
   *
   *
   * <pre>
   * List of NICs connected to this VM.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.NetworkInterface network_interfaces = 7;</code>
   */
  int getNetworkInterfacesCount();
  /**
   *
   *
   * <pre>
   * List of NICs connected to this VM.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.NetworkInterface network_interfaces = 7;</code>
   */
  java.util.List<? extends com.google.cloud.vmmigration.v1.NetworkInterfaceOrBuilder>
      getNetworkInterfacesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of NICs connected to this VM.
   * </pre>
   *
   * <code>repeated .google.cloud.vmmigration.v1.NetworkInterface network_interfaces = 7;</code>
   */
  com.google.cloud.vmmigration.v1.NetworkInterfaceOrBuilder getNetworkInterfacesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The service account to associate the VM with.
   * </pre>
   *
   * <code>string service_account = 8;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * The service account to associate the VM with.
   * </pre>
   *
   * <code>string service_account = 8;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * The disk type to use in the VM.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ComputeEngineDiskType disk_type = 9;</code>
   *
   * @return The enum numeric value on the wire for diskType.
   */
  int getDiskTypeValue();
  /**
   *
   *
   * <pre>
   * The disk type to use in the VM.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ComputeEngineDiskType disk_type = 9;</code>
   *
   * @return The diskType.
   */
  com.google.cloud.vmmigration.v1.ComputeEngineDiskType getDiskType();

  /**
   *
   *
   * <pre>
   * A map of labels to associate with the VM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * A map of labels to associate with the VM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * A map of labels to associate with the VM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * A map of labels to associate with the VM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * A map of labels to associate with the VM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The license type to use in OS adaptation.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ComputeEngineLicenseType license_type = 11;</code>
   *
   * @return The enum numeric value on the wire for licenseType.
   */
  int getLicenseTypeValue();
  /**
   *
   *
   * <pre>
   * The license type to use in OS adaptation.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ComputeEngineLicenseType license_type = 11;</code>
   *
   * @return The licenseType.
   */
  com.google.cloud.vmmigration.v1.ComputeEngineLicenseType getLicenseType();

  /**
   *
   *
   * <pre>
   * The OS license returned from the adaptation module report.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.AppliedLicense applied_license = 12;</code>
   *
   * @return Whether the appliedLicense field is set.
   */
  boolean hasAppliedLicense();
  /**
   *
   *
   * <pre>
   * The OS license returned from the adaptation module report.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.AppliedLicense applied_license = 12;</code>
   *
   * @return The appliedLicense.
   */
  com.google.cloud.vmmigration.v1.AppliedLicense getAppliedLicense();
  /**
   *
   *
   * <pre>
   * The OS license returned from the adaptation module report.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.AppliedLicense applied_license = 12;</code>
   */
  com.google.cloud.vmmigration.v1.AppliedLicenseOrBuilder getAppliedLicenseOrBuilder();

  /**
   *
   *
   * <pre>
   * Compute instance scheduling information (if empty default is used).
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ComputeScheduling compute_scheduling = 13;</code>
   *
   * @return Whether the computeScheduling field is set.
   */
  boolean hasComputeScheduling();
  /**
   *
   *
   * <pre>
   * Compute instance scheduling information (if empty default is used).
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ComputeScheduling compute_scheduling = 13;</code>
   *
   * @return The computeScheduling.
   */
  com.google.cloud.vmmigration.v1.ComputeScheduling getComputeScheduling();
  /**
   *
   *
   * <pre>
   * Compute instance scheduling information (if empty default is used).
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ComputeScheduling compute_scheduling = 13;</code>
   */
  com.google.cloud.vmmigration.v1.ComputeSchedulingOrBuilder getComputeSchedulingOrBuilder();

  /**
   *
   *
   * <pre>
   * Defines whether the instance has Secure Boot enabled.
   * This can be set to true only if the vm boot option is EFI.
   * </pre>
   *
   * <code>bool secure_boot = 14;</code>
   *
   * @return The secureBoot.
   */
  boolean getSecureBoot();

  /**
   *
   *
   * <pre>
   * The VM Boot Option, as set in the source vm.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ComputeEngineBootOption boot_option = 15;</code>
   *
   * @return The enum numeric value on the wire for bootOption.
   */
  int getBootOptionValue();
  /**
   *
   *
   * <pre>
   * The VM Boot Option, as set in the source vm.
   * </pre>
   *
   * <code>.google.cloud.vmmigration.v1.ComputeEngineBootOption boot_option = 15;</code>
   *
   * @return The bootOption.
   */
  com.google.cloud.vmmigration.v1.ComputeEngineBootOption getBootOption();

  /**
   *
   *
   * <pre>
   * The metadata key/value pairs to assign to the VM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 16;</code>
   */
  int getMetadataCount();
  /**
   *
   *
   * <pre>
   * The metadata key/value pairs to assign to the VM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 16;</code>
   */
  boolean containsMetadata(java.lang.String key);
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMetadata();
  /**
   *
   *
   * <pre>
   * The metadata key/value pairs to assign to the VM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 16;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMetadataMap();
  /**
   *
   *
   * <pre>
   * The metadata key/value pairs to assign to the VM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 16;</code>
   */

  /* nullable */
  java.lang.String getMetadataOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The metadata key/value pairs to assign to the VM.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 16;</code>
   */
  java.lang.String getMetadataOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Additional licenses to assign to the VM.
   * </pre>
   *
   * <code>repeated string additional_licenses = 17;</code>
   *
   * @return A list containing the additionalLicenses.
   */
  java.util.List<java.lang.String> getAdditionalLicensesList();
  /**
   *
   *
   * <pre>
   * Additional licenses to assign to the VM.
   * </pre>
   *
   * <code>repeated string additional_licenses = 17;</code>
   *
   * @return The count of additionalLicenses.
   */
  int getAdditionalLicensesCount();
  /**
   *
   *
   * <pre>
   * Additional licenses to assign to the VM.
   * </pre>
   *
   * <code>repeated string additional_licenses = 17;</code>
   *
   * @param index The index of the element to return.
   * @return The additionalLicenses at the given index.
   */
  java.lang.String getAdditionalLicenses(int index);
  /**
   *
   *
   * <pre>
   * Additional licenses to assign to the VM.
   * </pre>
   *
   * <code>repeated string additional_licenses = 17;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the additionalLicenses at the given index.
   */
  com.google.protobuf.ByteString getAdditionalLicensesBytes(int index);

  /**
   *
   *
   * <pre>
   * The hostname to assign to the VM.
   * </pre>
   *
   * <code>string hostname = 18;</code>
   *
   * @return The hostname.
   */
  java.lang.String getHostname();
  /**
   *
   *
   * <pre>
   * The hostname to assign to the VM.
   * </pre>
   *
   * <code>string hostname = 18;</code>
   *
   * @return The bytes for hostname.
   */
  com.google.protobuf.ByteString getHostnameBytes();
}
