// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

public final class SessionProto {
  private SessionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DetectIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DetectIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_QueryParameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_QueryParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_QueryInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_QueryInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_QueryResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_QueryResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_TextInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_TextInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_EventInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_EventInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Sentiment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Sentiment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/dialogflow/v2/session.pro"
          + "to\022\032google.cloud.dialogflow.v2\032\034google/a"
          + "pi/annotations.proto\032-google/cloud/dialo"
          + "gflow/v2/audio_config.proto\032(google/clou"
          + "d/dialogflow/v2/context.proto\032\'google/cl"
          + "oud/dialogflow/v2/intent.proto\0324google/c"
          + "loud/dialogflow/v2/session_entity_type.p"
          + "roto\032\036google/protobuf/duration.proto\032\034go"
          + "ogle/protobuf/struct.proto\032\027google/rpc/s"
          + "tatus.proto\032\030google/type/latlng.proto\032\027g"
          + "oogle/api/client.proto\"\207\002\n\023DetectIntentR"
          + "equest\022\017\n\007session\030\001 \001(\t\022A\n\014query_params\030"
          + "\002 \001(\0132+.google.cloud.dialogflow.v2.Query"
          + "Parameters\022;\n\013query_input\030\003 \001(\0132&.google"
          + ".cloud.dialogflow.v2.QueryInput\022J\n\023outpu"
          + "t_audio_config\030\004 \001(\0132-.google.cloud.dial"
          + "ogflow.v2.OutputAudioConfig\022\023\n\013input_aud"
          + "io\030\005 \001(\014\"\370\001\n\024DetectIntentResponse\022\023\n\013res"
          + "ponse_id\030\001 \001(\t\022=\n\014query_result\030\002 \001(\0132\'.g"
          + "oogle.cloud.dialogflow.v2.QueryResult\022*\n"
          + "\016webhook_status\030\003 \001(\0132\022.google.rpc.Statu"
          + "s\022\024\n\014output_audio\030\004 \001(\014\022J\n\023output_audio_"
          + "config\030\006 \001(\0132-.google.cloud.dialogflow.v"
          + "2.OutputAudioConfig\"\374\002\n\017QueryParameters\022"
          + "\021\n\ttime_zone\030\001 \001(\t\022)\n\014geo_location\030\002 \001(\013"
          + "2\023.google.type.LatLng\0225\n\010contexts\030\003 \003(\0132"
          + "#.google.cloud.dialogflow.v2.Context\022\026\n\016"
          + "reset_contexts\030\004 \001(\010\022K\n\024session_entity_t"
          + "ypes\030\005 \003(\0132-.google.cloud.dialogflow.v2."
          + "SessionEntityType\022(\n\007payload\030\006 \001(\0132\027.goo"
          + "gle.protobuf.Struct\022e\n!sentiment_analysi"
          + "s_request_config\030\n \001(\0132:.google.cloud.di"
          + "alogflow.v2.SentimentAnalysisRequestConf"
          + "ig\"\313\001\n\nQueryInput\022D\n\014audio_config\030\001 \001(\0132"
          + ",.google.cloud.dialogflow.v2.InputAudioC"
          + "onfigH\000\0225\n\004text\030\002 \001(\0132%.google.cloud.dia"
          + "logflow.v2.TextInputH\000\0227\n\005event\030\003 \001(\0132&."
          + "google.cloud.dialogflow.v2.EventInputH\000B"
          + "\007\n\005input\"\220\005\n\013QueryResult\022\022\n\nquery_text\030\001"
          + " \001(\t\022\025\n\rlanguage_code\030\017 \001(\t\022%\n\035speech_re"
          + "cognition_confidence\030\002 \001(\002\022\016\n\006action\030\003 \001"
          + "(\t\022+\n\nparameters\030\004 \001(\0132\027.google.protobuf"
          + ".Struct\022#\n\033all_required_params_present\030\005"
          + " \001(\010\022\030\n\020fulfillment_text\030\006 \001(\t\022H\n\024fulfil"
          + "lment_messages\030\007 \003(\0132*.google.cloud.dial"
          + "ogflow.v2.Intent.Message\022\026\n\016webhook_sour"
          + "ce\030\010 \001(\t\0220\n\017webhook_payload\030\t \001(\0132\027.goog"
          + "le.protobuf.Struct\022<\n\017output_contexts\030\n "
          + "\003(\0132#.google.cloud.dialogflow.v2.Context"
          + "\0222\n\006intent\030\013 \001(\0132\".google.cloud.dialogfl"
          + "ow.v2.Intent\022#\n\033intent_detection_confide"
          + "nce\030\014 \001(\002\0220\n\017diagnostic_info\030\016 \001(\0132\027.goo"
          + "gle.protobuf.Struct\022V\n\031sentiment_analysi"
          + "s_result\030\021 \001(\01323.google.cloud.dialogflow"
          + ".v2.SentimentAnalysisResult\"\256\002\n\034Streamin"
          + "gDetectIntentRequest\022\017\n\007session\030\001 \001(\t\022A\n"
          + "\014query_params\030\002 \001(\0132+.google.cloud.dialo"
          + "gflow.v2.QueryParameters\022;\n\013query_input\030"
          + "\003 \001(\0132&.google.cloud.dialogflow.v2.Query"
          + "Input\022\034\n\020single_utterance\030\004 \001(\010B\002\030\001\022J\n\023o"
          + "utput_audio_config\030\005 \001(\0132-.google.cloud."
          + "dialogflow.v2.OutputAudioConfig\022\023\n\013input"
          + "_audio\030\006 \001(\014\"\325\002\n\035StreamingDetectIntentRe"
          + "sponse\022\023\n\013response_id\030\001 \001(\t\022R\n\022recogniti"
          + "on_result\030\002 \001(\01326.google.cloud.dialogflo"
          + "w.v2.StreamingRecognitionResult\022=\n\014query"
          + "_result\030\003 \001(\0132\'.google.cloud.dialogflow."
          + "v2.QueryResult\022*\n\016webhook_status\030\004 \001(\0132\022"
          + ".google.rpc.Status\022\024\n\014output_audio\030\005 \001(\014"
          + "\022J\n\023output_audio_config\030\006 \001(\0132-.google.c"
          + "loud.dialogflow.v2.OutputAudioConfig\"\212\002\n"
          + "\032StreamingRecognitionResult\022X\n\014message_t"
          + "ype\030\001 \001(\0162B.google.cloud.dialogflow.v2.S"
          + "treamingRecognitionResult.MessageType\022\022\n"
          + "\ntranscript\030\002 \001(\t\022\020\n\010is_final\030\003 \001(\010\022\022\n\nc"
          + "onfidence\030\004 \001(\002\"X\n\013MessageType\022\034\n\030MESSAG"
          + "E_TYPE_UNSPECIFIED\020\000\022\016\n\nTRANSCRIPT\020\001\022\033\n\027"
          + "END_OF_SINGLE_UTTERANCE\020\002\"0\n\tTextInput\022\014"
          + "\n\004text\030\001 \001(\t\022\025\n\rlanguage_code\030\002 \001(\t\"^\n\nE"
          + "ventInput\022\014\n\004name\030\001 \001(\t\022+\n\nparameters\030\002 "
          + "\001(\0132\027.google.protobuf.Struct\022\025\n\rlanguage"
          + "_code\030\003 \001(\t\"F\n\036SentimentAnalysisRequestC"
          + "onfig\022$\n\034analyze_query_text_sentiment\030\001 "
          + "\001(\010\"^\n\027SentimentAnalysisResult\022C\n\024query_"
          + "text_sentiment\030\001 \001(\0132%.google.cloud.dial"
          + "ogflow.v2.Sentiment\"-\n\tSentiment\022\r\n\005scor"
          + "e\030\001 \001(\002\022\021\n\tmagnitude\030\002 \001(\0022\320\003\n\010Sessions\022"
          + "\264\001\n\014DetectIntent\022/.google.cloud.dialogfl"
          + "ow.v2.DetectIntentRequest\0320.google.cloud"
          + ".dialogflow.v2.DetectIntentResponse\"A\202\323\344"
          + "\223\002;\"6/v2/{session=projects/*/agent/sessi"
          + "ons/*}:detectIntent:\001*\022\222\001\n\025StreamingDete"
          + "ctIntent\0228.google.cloud.dialogflow.v2.St"
          + "reamingDetectIntentRequest\0329.google.clou"
          + "d.dialogflow.v2.StreamingDetectIntentRes"
          + "ponse\"\000(\0010\001\032x\312A\031dialogflow.googleapis.co"
          + "m\322AYhttps://www.googleapis.com/auth/clou"
          + "d-platform,https://www.googleapis.com/au"
          + "th/dialogflowB\233\001\n\036com.google.cloud.dialo"
          + "gflow.v2B\014SessionProtoP\001ZDgoogle.golang."
          + "org/genproto/googleapis/cloud/dialogflow"
          + "/v2;dialogflow\370\001\001\242\002\002DF\252\002\032Google.Cloud.Di"
          + "alogflow.V2b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.AudioConfigProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.ContextProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.IntentProto.getDescriptor(),
          com.google.cloud.dialogflow.v2.SessionEntityTypeProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.type.LatLngProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_dialogflow_v2_DetectIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_DetectIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DetectIntentRequest_descriptor,
            new java.lang.String[] {
              "Session", "QueryParams", "QueryInput", "OutputAudioConfig", "InputAudio",
            });
    internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DetectIntentResponse_descriptor,
            new java.lang.String[] {
              "ResponseId", "QueryResult", "WebhookStatus", "OutputAudio", "OutputAudioConfig",
            });
    internal_static_google_cloud_dialogflow_v2_QueryParameters_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_QueryParameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_QueryParameters_descriptor,
            new java.lang.String[] {
              "TimeZone",
              "GeoLocation",
              "Contexts",
              "ResetContexts",
              "SessionEntityTypes",
              "Payload",
              "SentimentAnalysisRequestConfig",
            });
    internal_static_google_cloud_dialogflow_v2_QueryInput_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_QueryInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_QueryInput_descriptor,
            new java.lang.String[] {
              "AudioConfig", "Text", "Event", "Input",
            });
    internal_static_google_cloud_dialogflow_v2_QueryResult_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_QueryResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_QueryResult_descriptor,
            new java.lang.String[] {
              "QueryText",
              "LanguageCode",
              "SpeechRecognitionConfidence",
              "Action",
              "Parameters",
              "AllRequiredParamsPresent",
              "FulfillmentText",
              "FulfillmentMessages",
              "WebhookSource",
              "WebhookPayload",
              "OutputContexts",
              "Intent",
              "IntentDetectionConfidence",
              "DiagnosticInfo",
              "SentimentAnalysisResult",
            });
    internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentRequest_descriptor,
            new java.lang.String[] {
              "Session",
              "QueryParams",
              "QueryInput",
              "SingleUtterance",
              "OutputAudioConfig",
              "InputAudio",
            });
    internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_StreamingDetectIntentResponse_descriptor,
            new java.lang.String[] {
              "ResponseId",
              "RecognitionResult",
              "QueryResult",
              "WebhookStatus",
              "OutputAudio",
              "OutputAudioConfig",
            });
    internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_StreamingRecognitionResult_descriptor,
            new java.lang.String[] {
              "MessageType", "Transcript", "IsFinal", "Confidence",
            });
    internal_static_google_cloud_dialogflow_v2_TextInput_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2_TextInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_TextInput_descriptor,
            new java.lang.String[] {
              "Text", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2_EventInput_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2_EventInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_EventInput_descriptor,
            new java.lang.String[] {
              "Name", "Parameters", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SentimentAnalysisRequestConfig_descriptor,
            new java.lang.String[] {
              "AnalyzeQueryTextSentiment",
            });
    internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_descriptor,
            new java.lang.String[] {
              "QueryTextSentiment",
            });
    internal_static_google_cloud_dialogflow_v2_Sentiment_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2_Sentiment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Sentiment_descriptor,
            new java.lang.String[] {
              "Score", "Magnitude",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.dialogflow.v2.AudioConfigProto.getDescriptor();
    com.google.cloud.dialogflow.v2.ContextProto.getDescriptor();
    com.google.cloud.dialogflow.v2.IntentProto.getDescriptor();
    com.google.cloud.dialogflow.v2.SessionEntityTypeProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
