// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/audio_config.proto

package com.google.cloud.dialogflow.v2beta1;

public final class AudioConfigProto {
  private AudioConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/dialogflow/v2beta1/audio_"
          + "config.proto\022\037google.cloud.dialogflow.v2"
          + "beta1\032\036google/protobuf/duration.proto\032\034g"
          + "oogle/api/annotations.proto\"\222\001\n\016SpeechWo"
          + "rdInfo\022\014\n\004word\030\003 \001(\t\022/\n\014start_offset\030\001 \001"
          + "(\0132\031.google.protobuf.Duration\022-\n\nend_off"
          + "set\030\002 \001(\0132\031.google.protobuf.Duration\022\022\n\n"
          + "confidence\030\004 \001(\002\"\261\002\n\020InputAudioConfig\022F\n"
          + "\016audio_encoding\030\001 \001(\0162..google.cloud.dia"
          + "logflow.v2beta1.AudioEncoding\022\031\n\021sample_"
          + "rate_hertz\030\002 \001(\005\022\025\n\rlanguage_code\030\003 \001(\t\022"
          + "\030\n\020enable_word_info\030\r \001(\010\022\024\n\014phrase_hint"
          + "s\030\004 \003(\t\022\r\n\005model\030\007 \001(\t\022J\n\rmodel_variant\030"
          + "\n \001(\01623.google.cloud.dialogflow.v2beta1."
          + "SpeechModelVariant\022\030\n\020single_utterance\030\010"
          + " \001(\010\"k\n\024VoiceSelectionParams\022\014\n\004name\030\001 \001"
          + "(\t\022E\n\013ssml_gender\030\002 \001(\01620.google.cloud.d"
          + "ialogflow.v2beta1.SsmlVoiceGender\"\270\001\n\026Sy"
          + "nthesizeSpeechConfig\022\025\n\rspeaking_rate\030\001 "
          + "\001(\001\022\r\n\005pitch\030\002 \001(\001\022\026\n\016volume_gain_db\030\003 \001"
          + "(\001\022\032\n\022effects_profile_id\030\005 \003(\t\022D\n\005voice\030"
          + "\004 \001(\01325.google.cloud.dialogflow.v2beta1."
          + "VoiceSelectionParams\"\327\001\n\021OutputAudioConf"
          + "ig\022L\n\016audio_encoding\030\001 \001(\01624.google.clou"
          + "d.dialogflow.v2beta1.OutputAudioEncoding"
          + "\022\031\n\021sample_rate_hertz\030\002 \001(\005\022Y\n\030synthesiz"
          + "e_speech_config\030\003 \001(\01327.google.cloud.dia"
          + "logflow.v2beta1.SynthesizeSpeechConfig*\373"
          + "\001\n\rAudioEncoding\022\036\n\032AUDIO_ENCODING_UNSPE"
          + "CIFIED\020\000\022\034\n\030AUDIO_ENCODING_LINEAR_16\020\001\022\027"
          + "\n\023AUDIO_ENCODING_FLAC\020\002\022\030\n\024AUDIO_ENCODIN"
          + "G_MULAW\020\003\022\026\n\022AUDIO_ENCODING_AMR\020\004\022\031\n\025AUD"
          + "IO_ENCODING_AMR_WB\020\005\022\033\n\027AUDIO_ENCODING_O"
          + "GG_OPUS\020\006\022)\n%AUDIO_ENCODING_SPEEX_WITH_H"
          + "EADER_BYTE\020\007*v\n\022SpeechModelVariant\022$\n SP"
          + "EECH_MODEL_VARIANT_UNSPECIFIED\020\000\022\026\n\022USE_"
          + "BEST_AVAILABLE\020\001\022\020\n\014USE_STANDARD\020\002\022\020\n\014US"
          + "E_ENHANCED\020\003*\215\001\n\017SsmlVoiceGender\022!\n\035SSML"
          + "_VOICE_GENDER_UNSPECIFIED\020\000\022\032\n\026SSML_VOIC"
          + "E_GENDER_MALE\020\001\022\034\n\030SSML_VOICE_GENDER_FEM"
          + "ALE\020\002\022\035\n\031SSML_VOICE_GENDER_NEUTRAL\020\003*\244\001\n"
          + "\023OutputAudioEncoding\022%\n!OUTPUT_AUDIO_ENC"
          + "ODING_UNSPECIFIED\020\000\022#\n\037OUTPUT_AUDIO_ENCO"
          + "DING_LINEAR_16\020\001\022\035\n\031OUTPUT_AUDIO_ENCODIN"
          + "G_MP3\020\002\022\"\n\036OUTPUT_AUDIO_ENCODING_OGG_OPU"
          + "S\020\003B\256\001\n#com.google.cloud.dialogflow.v2be"
          + "ta1B\020AudioConfigProtoP\001ZIgoogle.golang.o"
          + "rg/genproto/googleapis/cloud/dialogflow/"
          + "v2beta1;dialogflow\370\001\001\242\002\002DF\252\002\037Google.Clou"
          + "d.Dialogflow.V2beta1b\006proto3"
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
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SpeechWordInfo_descriptor,
            new java.lang.String[] {
              "Word", "StartOffset", "EndOffset", "Confidence",
            });
    internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding",
              "SampleRateHertz",
              "LanguageCode",
              "EnableWordInfo",
              "PhraseHints",
              "Model",
              "ModelVariant",
              "SingleUtterance",
            });
    internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_VoiceSelectionParams_descriptor,
            new java.lang.String[] {
              "Name", "SsmlGender",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SynthesizeSpeechConfig_descriptor,
            new java.lang.String[] {
              "SpeakingRate", "Pitch", "VolumeGainDb", "EffectsProfileId", "Voice",
            });
    internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_OutputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding", "SampleRateHertz", "SynthesizeSpeechConfig",
            });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
