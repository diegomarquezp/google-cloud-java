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
// source: google/cloud/aiplatform/v1beta1/model.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class ModelProto {
  private ModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Model_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Model_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Model_ExportFormat_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Model_ExportFormat_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Model_OriginalModelInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Model_OriginalModelInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Model_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Model_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_LargeModelReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_LargeModelReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PredictSchemata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PredictSchemata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelContainerSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelContainerSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Port_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Port_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelSourceInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelSourceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Probe_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Probe_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Probe_ExecAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Probe_ExecAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/aiplatform/v1beta1/model."
          + "proto\022\037google.cloud.aiplatform.v1beta1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\0328google/cloud/aiplatf"
          + "orm/v1beta1/deployed_model_ref.proto\0325go"
          + "ogle/cloud/aiplatform/v1beta1/encryption"
          + "_spec.proto\032-google/cloud/aiplatform/v1b"
          + "eta1/env_var.proto\0321google/cloud/aiplatf"
          + "orm/v1beta1/explanation.proto\032\036google/pr"
          + "otobuf/duration.proto\032\034google/protobuf/s"
          + "truct.proto\032\037google/protobuf/timestamp.p"
          + "roto\"\321\020\n\005Model\022\014\n\004name\030\001 \001(\t\022\032\n\nversion_"
          + "id\030\034 \001(\tB\006\340A\005\340A\003\022\027\n\017version_aliases\030\035 \003("
          + "\t\022<\n\023version_create_time\030\037 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\022<\n\023version_updat"
          + "e_time\030  \001(\0132\032.google.protobuf.Timestamp"
          + "B\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\023\n\013desc"
          + "ription\030\003 \001(\t\022\033\n\023version_description\030\036 \001"
          + "(\t\022J\n\020predict_schemata\030\004 \001(\01320.google.cl"
          + "oud.aiplatform.v1beta1.PredictSchemata\022 "
          + "\n\023metadata_schema_uri\030\005 \001(\tB\003\340A\005\022-\n\010meta"
          + "data\030\006 \001(\0132\026.google.protobuf.ValueB\003\340A\005\022"
          + "Z\n\030supported_export_formats\030\024 \003(\01323.goog"
          + "le.cloud.aiplatform.v1beta1.Model.Export"
          + "FormatB\003\340A\003\022M\n\021training_pipeline\030\007 \001(\tB2"
          + "\340A\003\372A,\n*aiplatform.googleapis.com/Traini"
          + "ngPipeline\022P\n\016container_spec\030\t \001(\01323.goo"
          + "gle.cloud.aiplatform.v1beta1.ModelContai"
          + "nerSpecB\003\340A\004\022\031\n\014artifact_uri\030\032 \001(\tB\003\340A\005\022"
          + "q\n$supported_deployment_resources_types\030"
          + "\n \003(\0162>.google.cloud.aiplatform.v1beta1."
          + "Model.DeploymentResourcesTypeB\003\340A\003\022,\n\037su"
          + "pported_input_storage_formats\030\013 \003(\tB\003\340A\003"
          + "\022-\n supported_output_storage_formats\030\014 \003"
          + "(\tB\003\340A\003\0224\n\013create_time\030\r \001(\0132\032.google.pr"
          + "otobuf.TimestampB\003\340A\003\0224\n\013update_time\030\016 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\022O\n\017d"
          + "eployed_models\030\017 \003(\01321.google.cloud.aipl"
          + "atform.v1beta1.DeployedModelRefB\003\340A\003\022J\n\020"
          + "explanation_spec\030\027 \001(\01320.google.cloud.ai"
          + "platform.v1beta1.ExplanationSpec\022\014\n\004etag"
          + "\030\020 \001(\t\022B\n\006labels\030\021 \003(\01322.google.cloud.ai"
          + "platform.v1beta1.Model.LabelsEntry\022H\n\017en"
          + "cryption_spec\030\030 \001(\0132/.google.cloud.aipla"
          + "tform.v1beta1.EncryptionSpec\022P\n\021model_so"
          + "urce_info\030& \001(\01320.google.cloud.aiplatfor"
          + "m.v1beta1.ModelSourceInfoB\003\340A\003\022Z\n\023origin"
          + "al_model_info\030\" \001(\01328.google.cloud.aipla"
          + "tform.v1beta1.Model.OriginalModelInfoB\003\340"
          + "A\003\022\036\n\021metadata_artifact\030, \001(\tB\003\340A\003\032\332\001\n\014E"
          + "xportFormat\022\017\n\002id\030\001 \001(\tB\003\340A\003\022g\n\023exportab"
          + "le_contents\030\002 \003(\0162E.google.cloud.aiplatf"
          + "orm.v1beta1.Model.ExportFormat.Exportabl"
          + "eContentB\003\340A\003\"P\n\021ExportableContent\022\"\n\036EX"
          + "PORTABLE_CONTENT_UNSPECIFIED\020\000\022\014\n\010ARTIFA"
          + "CT\020\001\022\t\n\005IMAGE\020\002\032K\n\021OriginalModelInfo\0226\n\005"
          + "model\030\001 \001(\tB\'\340A\003\372A!\n\037aiplatform.googleap"
          + "is.com/Model\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t"
          + "\022\r\n\005value\030\002 \001(\t:\0028\001\"\214\001\n\027DeploymentResour"
          + "cesType\022)\n%DEPLOYMENT_RESOURCES_TYPE_UNS"
          + "PECIFIED\020\000\022\027\n\023DEDICATED_RESOURCES\020\001\022\027\n\023A"
          + "UTOMATIC_RESOURCES\020\002\022\024\n\020SHARED_RESOURCES"
          + "\020\003:\\\352AY\n\037aiplatform.googleapis.com/Model"
          + "\0226projects/{project}/locations/{location"
          + "}/models/{model}\"(\n\023LargeModelReference\022"
          + "\021\n\004name\030\001 \001(\tB\003\340A\002\"{\n\017PredictSchemata\022 \n"
          + "\023instance_schema_uri\030\001 \001(\tB\003\340A\005\022\"\n\025param"
          + "eters_schema_uri\030\002 \001(\tB\003\340A\005\022\"\n\025predictio"
          + "n_schema_uri\030\003 \001(\tB\003\340A\005\"\254\004\n\022ModelContain"
          + "erSpec\022\031\n\timage_uri\030\001 \001(\tB\006\340A\002\340A\005\022\024\n\007com"
          + "mand\030\002 \003(\tB\003\340A\005\022\021\n\004args\030\003 \003(\tB\003\340A\005\0229\n\003en"
          + "v\030\004 \003(\0132\'.google.cloud.aiplatform.v1beta"
          + "1.EnvVarB\003\340A\005\0229\n\005ports\030\005 \003(\0132%.google.cl"
          + "oud.aiplatform.v1beta1.PortB\003\340A\005\022\032\n\rpred"
          + "ict_route\030\006 \001(\tB\003\340A\005\022\031\n\014health_route\030\007 \001"
          + "(\tB\003\340A\005\022>\n\ngrpc_ports\030\t \003(\0132%.google.clo"
          + "ud.aiplatform.v1beta1.PortB\003\340A\005\022:\n\022deplo"
          + "yment_timeout\030\n \001(\0132\031.google.protobuf.Du"
          + "rationB\003\340A\005\022\"\n\025shared_memory_size_mb\030\013 \001"
          + "(\003B\003\340A\005\022B\n\rstartup_probe\030\014 \001(\0132&.google."
          + "cloud.aiplatform.v1beta1.ProbeB\003\340A\005\022A\n\014h"
          + "ealth_probe\030\r \001(\0132&.google.cloud.aiplatf"
          + "orm.v1beta1.ProbeB\003\340A\005\"\036\n\004Port\022\026\n\016contai"
          + "ner_port\030\003 \001(\005\"\230\002\n\017ModelSourceInfo\022U\n\013so"
          + "urce_type\030\001 \001(\0162@.google.cloud.aiplatfor"
          + "m.v1beta1.ModelSourceInfo.ModelSourceTyp"
          + "e\022\014\n\004copy\030\002 \001(\010\"\237\001\n\017ModelSourceType\022!\n\035M"
          + "ODEL_SOURCE_TYPE_UNSPECIFIED\020\000\022\n\n\006AUTOML"
          + "\020\001\022\n\n\006CUSTOM\020\002\022\010\n\004BQML\020\003\022\020\n\014MODEL_GARDEN"
          + "\020\004\022\t\n\005GENIE\020\005\022\031\n\025CUSTOM_TEXT_EMBEDDING\020\006"
          + "\022\017\n\013MARKETPLACE\020\007\"\250\001\n\005Probe\022A\n\004exec\030\001 \001("
          + "\01321.google.cloud.aiplatform.v1beta1.Prob"
          + "e.ExecActionH\000\022\026\n\016period_seconds\030\002 \001(\005\022\027"
          + "\n\017timeout_seconds\030\003 \001(\005\032\035\n\nExecAction\022\017\n"
          + "\007command\030\001 \003(\tB\014\n\nprobe_typeB\341\001\n#com.goo"
          + "gle.cloud.aiplatform.v1beta1B\nModelProto"
          + "P\001ZCcloud.google.com/go/aiplatform/apiv1"
          + "beta1/aiplatformpb;aiplatformpb\252\002\037Google"
          + ".Cloud.AIPlatform.V1Beta1\312\002\037Google\\Cloud"
          + "\\AIPlatform\\V1beta1\352\002\"Google::Cloud::AIP"
          + "latform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.DeployedModelNameProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EnvVarProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Model_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Model_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Model_descriptor,
            new java.lang.String[] {
              "Name",
              "VersionId",
              "VersionAliases",
              "VersionCreateTime",
              "VersionUpdateTime",
              "DisplayName",
              "Description",
              "VersionDescription",
              "PredictSchemata",
              "MetadataSchemaUri",
              "Metadata",
              "SupportedExportFormats",
              "TrainingPipeline",
              "ContainerSpec",
              "ArtifactUri",
              "SupportedDeploymentResourcesTypes",
              "SupportedInputStorageFormats",
              "SupportedOutputStorageFormats",
              "CreateTime",
              "UpdateTime",
              "DeployedModels",
              "ExplanationSpec",
              "Etag",
              "Labels",
              "EncryptionSpec",
              "ModelSourceInfo",
              "OriginalModelInfo",
              "MetadataArtifact",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Model_ExportFormat_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Model_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Model_ExportFormat_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Model_ExportFormat_descriptor,
            new java.lang.String[] {
              "Id", "ExportableContents",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Model_OriginalModelInfo_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Model_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_Model_OriginalModelInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Model_OriginalModelInfo_descriptor,
            new java.lang.String[] {
              "Model",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Model_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Model_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_Model_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Model_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_LargeModelReference_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_LargeModelReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_LargeModelReference_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PredictSchemata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_PredictSchemata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PredictSchemata_descriptor,
            new java.lang.String[] {
              "InstanceSchemaUri", "ParametersSchemaUri", "PredictionSchemaUri",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelContainerSpec_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ModelContainerSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelContainerSpec_descriptor,
            new java.lang.String[] {
              "ImageUri",
              "Command",
              "Args",
              "Env",
              "Ports",
              "PredictRoute",
              "HealthRoute",
              "GrpcPorts",
              "DeploymentTimeout",
              "SharedMemorySizeMb",
              "StartupProbe",
              "HealthProbe",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Port_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_Port_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Port_descriptor,
            new java.lang.String[] {
              "ContainerPort",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelSourceInfo_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_ModelSourceInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelSourceInfo_descriptor,
            new java.lang.String[] {
              "SourceType", "Copy",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Probe_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_Probe_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Probe_descriptor,
            new java.lang.String[] {
              "Exec", "PeriodSeconds", "TimeoutSeconds", "ProbeType",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Probe_ExecAction_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Probe_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Probe_ExecAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Probe_ExecAction_descriptor,
            new java.lang.String[] {
              "Command",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.DeployedModelNameProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EnvVarProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
