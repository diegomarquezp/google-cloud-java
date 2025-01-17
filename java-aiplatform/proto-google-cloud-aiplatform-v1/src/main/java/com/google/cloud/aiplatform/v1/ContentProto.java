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
// source: google/cloud/aiplatform/v1/content.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class ContentProto {
  private ContentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Content_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Content_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Part_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Part_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Blob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Blob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FileData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FileData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_VideoMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_VideoMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GenerationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GenerationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_SafetySetting_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SafetySetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_SafetyRating_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SafetyRating_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CitationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CitationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Citation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Citation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Candidate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Candidate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/aiplatform/v1/content.pro"
          + "to\022\032google.cloud.aiplatform.v1\032\037google/a"
          + "pi/field_behavior.proto\032%google/cloud/ai"
          + "platform/v1/tool.proto\032\036google/protobuf/"
          + "duration.proto\032\026google/type/date.proto\"R"
          + "\n\007Content\022\021\n\004role\030\001 \001(\tB\003\340A\001\0224\n\005parts\030\002 "
          + "\003(\0132 .google.cloud.aiplatform.v1.PartB\003\340"
          + "A\002\"\217\003\n\004Part\022\023\n\004text\030\001 \001(\tB\003\340A\001H\000\022<\n\013inli"
          + "ne_data\030\002 \001(\0132 .google.cloud.aiplatform."
          + "v1.BlobB\003\340A\001H\000\022>\n\tfile_data\030\003 \001(\0132$.goog"
          + "le.cloud.aiplatform.v1.FileDataB\003\340A\001H\000\022F"
          + "\n\rfunction_call\030\005 \001(\0132(.google.cloud.aip"
          + "latform.v1.FunctionCallB\003\340A\001H\000\022N\n\021functi"
          + "on_response\030\006 \001(\0132,.google.cloud.aiplatf"
          + "orm.v1.FunctionResponseB\003\340A\001H\000\022H\n\016video_"
          + "metadata\030\004 \001(\0132).google.cloud.aiplatform"
          + ".v1.VideoMetadataB\003\340A\001H\001B\006\n\004dataB\n\n\010meta"
          + "data\"1\n\004Blob\022\026\n\tmime_type\030\001 \001(\tB\003\340A\002\022\021\n\004"
          + "data\030\002 \001(\014B\003\340A\002\"9\n\010FileData\022\026\n\tmime_type"
          + "\030\001 \001(\tB\003\340A\002\022\025\n\010file_uri\030\002 \001(\tB\003\340A\002\"y\n\rVi"
          + "deoMetadata\0224\n\014start_offset\030\001 \001(\0132\031.goog"
          + "le.protobuf.DurationB\003\340A\001\0222\n\nend_offset\030"
          + "\002 \001(\0132\031.google.protobuf.DurationB\003\340A\001\"\226\002"
          + "\n\020GenerationConfig\022\035\n\013temperature\030\001 \001(\002B"
          + "\003\340A\001H\000\210\001\001\022\027\n\005top_p\030\002 \001(\002B\003\340A\001H\001\210\001\001\022\027\n\005to"
          + "p_k\030\003 \001(\002B\003\340A\001H\002\210\001\001\022!\n\017candidate_count\030\004"
          + " \001(\005B\003\340A\001H\003\210\001\001\022#\n\021max_output_tokens\030\005 \001("
          + "\005B\003\340A\001H\004\210\001\001\022\033\n\016stop_sequences\030\006 \003(\tB\003\340A\001"
          + "B\016\n\014_temperatureB\010\n\006_top_pB\010\n\006_top_kB\022\n\020"
          + "_candidate_countB\024\n\022_max_output_tokens\"\275"
          + "\002\n\rSafetySetting\022?\n\010category\030\001 \001(\0162(.goo"
          + "gle.cloud.aiplatform.v1.HarmCategoryB\003\340A"
          + "\002\022T\n\tthreshold\030\002 \001(\0162<.google.cloud.aipl"
          + "atform.v1.SafetySetting.HarmBlockThresho"
          + "ldB\003\340A\002\"\224\001\n\022HarmBlockThreshold\022$\n HARM_B"
          + "LOCK_THRESHOLD_UNSPECIFIED\020\000\022\027\n\023BLOCK_LO"
          + "W_AND_ABOVE\020\001\022\032\n\026BLOCK_MEDIUM_AND_ABOVE\020"
          + "\002\022\023\n\017BLOCK_ONLY_HIGH\020\003\022\016\n\nBLOCK_NONE\020\004\"\235"
          + "\002\n\014SafetyRating\022?\n\010category\030\001 \001(\0162(.goog"
          + "le.cloud.aiplatform.v1.HarmCategoryB\003\340A\003"
          + "\022R\n\013probability\030\002 \001(\01628.google.cloud.aip"
          + "latform.v1.SafetyRating.HarmProbabilityB"
          + "\003\340A\003\022\024\n\007blocked\030\003 \001(\010B\003\340A\003\"b\n\017HarmProbab"
          + "ility\022 \n\034HARM_PROBABILITY_UNSPECIFIED\020\000\022"
          + "\016\n\nNEGLIGIBLE\020\001\022\007\n\003LOW\020\002\022\n\n\006MEDIUM\020\003\022\010\n\004"
          + "HIGH\020\004\"P\n\020CitationMetadata\022<\n\tcitations\030"
          + "\001 \003(\0132$.google.cloud.aiplatform.v1.Citat"
          + "ionB\003\340A\003\"\252\001\n\010Citation\022\030\n\013start_index\030\001 \001"
          + "(\005B\003\340A\003\022\026\n\tend_index\030\002 \001(\005B\003\340A\003\022\020\n\003uri\030\003"
          + " \001(\tB\003\340A\003\022\022\n\005title\030\004 \001(\tB\003\340A\003\022\024\n\007license"
          + "\030\005 \001(\tB\003\340A\003\0220\n\020publication_date\030\006 \001(\0132\021."
          + "google.type.DateB\003\340A\003\"\344\003\n\tCandidate\022\022\n\005i"
          + "ndex\030\001 \001(\005B\003\340A\003\0229\n\007content\030\002 \001(\0132#.googl"
          + "e.cloud.aiplatform.v1.ContentB\003\340A\003\022N\n\rfi"
          + "nish_reason\030\003 \001(\01622.google.cloud.aiplatf"
          + "orm.v1.Candidate.FinishReasonB\003\340A\003\022E\n\016sa"
          + "fety_ratings\030\004 \003(\0132(.google.cloud.aiplat"
          + "form.v1.SafetyRatingB\003\340A\003\022 \n\016finish_mess"
          + "age\030\005 \001(\tB\003\340A\003H\000\210\001\001\022L\n\021citation_metadata"
          + "\030\006 \001(\0132,.google.cloud.aiplatform.v1.Cita"
          + "tionMetadataB\003\340A\003\"n\n\014FinishReason\022\035\n\031FIN"
          + "ISH_REASON_UNSPECIFIED\020\000\022\010\n\004STOP\020\001\022\016\n\nMA"
          + "X_TOKENS\020\002\022\n\n\006SAFETY\020\003\022\016\n\nRECITATION\020\004\022\t"
          + "\n\005OTHER\020\005B\021\n\017_finish_message*\264\001\n\014HarmCat"
          + "egory\022\035\n\031HARM_CATEGORY_UNSPECIFIED\020\000\022\035\n\031"
          + "HARM_CATEGORY_HATE_SPEECH\020\001\022#\n\037HARM_CATE"
          + "GORY_DANGEROUS_CONTENT\020\002\022\034\n\030HARM_CATEGOR"
          + "Y_HARASSMENT\020\003\022#\n\037HARM_CATEGORY_SEXUALLY"
          + "_EXPLICIT\020\004B\312\001\n\036com.google.cloud.aiplatf"
          + "orm.v1B\014ContentProtoP\001Z>cloud.google.com"
          + "/go/aiplatform/apiv1/aiplatformpb;aiplat"
          + "formpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Go"
          + "ogle\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud"
          + "::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ToolProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Content_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Content_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Content_descriptor,
            new java.lang.String[] {
              "Role", "Parts",
            });
    internal_static_google_cloud_aiplatform_v1_Part_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_Part_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Part_descriptor,
            new java.lang.String[] {
              "Text",
              "InlineData",
              "FileData",
              "FunctionCall",
              "FunctionResponse",
              "VideoMetadata",
              "Data",
              "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1_Blob_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_Blob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Blob_descriptor,
            new java.lang.String[] {
              "MimeType", "Data",
            });
    internal_static_google_cloud_aiplatform_v1_FileData_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_FileData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FileData_descriptor,
            new java.lang.String[] {
              "MimeType", "FileUri",
            });
    internal_static_google_cloud_aiplatform_v1_VideoMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_VideoMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_VideoMetadata_descriptor,
            new java.lang.String[] {
              "StartOffset", "EndOffset",
            });
    internal_static_google_cloud_aiplatform_v1_GenerationConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_GenerationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GenerationConfig_descriptor,
            new java.lang.String[] {
              "Temperature", "TopP", "TopK", "CandidateCount", "MaxOutputTokens", "StopSequences",
            });
    internal_static_google_cloud_aiplatform_v1_SafetySetting_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_SafetySetting_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_SafetySetting_descriptor,
            new java.lang.String[] {
              "Category", "Threshold",
            });
    internal_static_google_cloud_aiplatform_v1_SafetyRating_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_SafetyRating_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_SafetyRating_descriptor,
            new java.lang.String[] {
              "Category", "Probability", "Blocked",
            });
    internal_static_google_cloud_aiplatform_v1_CitationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_CitationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CitationMetadata_descriptor,
            new java.lang.String[] {
              "Citations",
            });
    internal_static_google_cloud_aiplatform_v1_Citation_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1_Citation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Citation_descriptor,
            new java.lang.String[] {
              "StartIndex", "EndIndex", "Uri", "Title", "License", "PublicationDate",
            });
    internal_static_google_cloud_aiplatform_v1_Candidate_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1_Candidate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Candidate_descriptor,
            new java.lang.String[] {
              "Index",
              "Content",
              "FinishReason",
              "SafetyRatings",
              "FinishMessage",
              "CitationMetadata",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ToolProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
