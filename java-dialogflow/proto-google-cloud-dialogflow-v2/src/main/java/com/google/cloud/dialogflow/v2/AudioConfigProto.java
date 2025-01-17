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
// source: google/cloud/dialogflow/v2/audio_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dialogflow.v2;

public final class AudioConfigProto {
  private AudioConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SpeechContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SpeechContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SpeechWordInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SpeechWordInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_InputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_InputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_TelephonyDtmfEvents_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_TelephonyDtmfEvents_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/v2/audio_confi"
          + "g.proto\022\032google.cloud.dialogflow.v2\032\037goo"
          + "gle/api/field_behavior.proto\032\031google/api"
          + "/resource.proto\032\036google/protobuf/duratio"
          + "n.proto\"9\n\rSpeechContext\022\024\n\007phrases\030\001 \003("
          + "\tB\003\340A\001\022\022\n\005boost\030\002 \001(\002B\003\340A\001\"\222\001\n\016SpeechWor"
          + "dInfo\022\014\n\004word\030\003 \001(\t\022/\n\014start_offset\030\001 \001("
          + "\0132\031.google.protobuf.Duration\022-\n\nend_offs"
          + "et\030\002 \001(\0132\031.google.protobuf.Duration\022\022\n\nc"
          + "onfidence\030\004 \001(\002\"\320\003\n\020InputAudioConfig\022F\n\016"
          + "audio_encoding\030\001 \001(\0162).google.cloud.dial"
          + "ogflow.v2.AudioEncodingB\003\340A\002\022\036\n\021sample_r"
          + "ate_hertz\030\002 \001(\005B\003\340A\002\022\032\n\rlanguage_code\030\003 "
          + "\001(\tB\003\340A\002\022\030\n\020enable_word_info\030\r \001(\010\022\030\n\014ph"
          + "rase_hints\030\004 \003(\tB\002\030\001\022B\n\017speech_contexts\030"
          + "\013 \003(\0132).google.cloud.dialogflow.v2.Speec"
          + "hContext\022\r\n\005model\030\007 \001(\t\022E\n\rmodel_variant"
          + "\030\n \001(\0162..google.cloud.dialogflow.v2.Spee"
          + "chModelVariant\022\030\n\020single_utterance\030\010 \001(\010"
          + "\022*\n\"disable_no_speech_recognized_event\030\016"
          + " \001(\010\022$\n\034enable_automatic_punctuation\030\021 \001"
          + "(\010\"p\n\024VoiceSelectionParams\022\021\n\004name\030\001 \001(\t"
          + "B\003\340A\001\022E\n\013ssml_gender\030\002 \001(\0162+.google.clou"
          + "d.dialogflow.v2.SsmlVoiceGenderB\003\340A\001\"\314\001\n"
          + "\026SynthesizeSpeechConfig\022\032\n\rspeaking_rate"
          + "\030\001 \001(\001B\003\340A\001\022\022\n\005pitch\030\002 \001(\001B\003\340A\001\022\033\n\016volum"
          + "e_gain_db\030\003 \001(\001B\003\340A\001\022\037\n\022effects_profile_"
          + "id\030\005 \003(\tB\003\340A\001\022D\n\005voice\030\004 \001(\01320.google.cl"
          + "oud.dialogflow.v2.VoiceSelectionParamsB\003"
          + "\340A\001\"\322\001\n\021OutputAudioConfig\022L\n\016audio_encod"
          + "ing\030\001 \001(\0162/.google.cloud.dialogflow.v2.O"
          + "utputAudioEncodingB\003\340A\002\022\031\n\021sample_rate_h"
          + "ertz\030\002 \001(\005\022T\n\030synthesize_speech_config\030\003"
          + " \001(\01322.google.cloud.dialogflow.v2.Synthe"
          + "sizeSpeechConfig\"U\n\023TelephonyDtmfEvents\022"
          + ">\n\013dtmf_events\030\001 \003(\0162).google.cloud.dial"
          + "ogflow.v2.TelephonyDtmf\"\230\001\n\022SpeechToText"
          + "Config\022L\n\024speech_model_variant\030\001 \001(\0162..g"
          + "oogle.cloud.dialogflow.v2.SpeechModelVar"
          + "iant\022\r\n\005model\030\002 \001(\t\022%\n\035use_timeout_based"
          + "_endpointing\030\013 \001(\010*\224\002\n\rTelephonyDtmf\022\036\n\032"
          + "TELEPHONY_DTMF_UNSPECIFIED\020\000\022\014\n\010DTMF_ONE"
          + "\020\001\022\014\n\010DTMF_TWO\020\002\022\016\n\nDTMF_THREE\020\003\022\r\n\tDTMF"
          + "_FOUR\020\004\022\r\n\tDTMF_FIVE\020\005\022\014\n\010DTMF_SIX\020\006\022\016\n\n"
          + "DTMF_SEVEN\020\007\022\016\n\nDTMF_EIGHT\020\010\022\r\n\tDTMF_NIN"
          + "E\020\t\022\r\n\tDTMF_ZERO\020\n\022\n\n\006DTMF_A\020\013\022\n\n\006DTMF_B"
          + "\020\014\022\n\n\006DTMF_C\020\r\022\n\n\006DTMF_D\020\016\022\r\n\tDTMF_STAR\020"
          + "\017\022\016\n\nDTMF_POUND\020\020*\373\001\n\rAudioEncoding\022\036\n\032A"
          + "UDIO_ENCODING_UNSPECIFIED\020\000\022\034\n\030AUDIO_ENC"
          + "ODING_LINEAR_16\020\001\022\027\n\023AUDIO_ENCODING_FLAC"
          + "\020\002\022\030\n\024AUDIO_ENCODING_MULAW\020\003\022\026\n\022AUDIO_EN"
          + "CODING_AMR\020\004\022\031\n\025AUDIO_ENCODING_AMR_WB\020\005\022"
          + "\033\n\027AUDIO_ENCODING_OGG_OPUS\020\006\022)\n%AUDIO_EN"
          + "CODING_SPEEX_WITH_HEADER_BYTE\020\007*v\n\022Speec"
          + "hModelVariant\022$\n SPEECH_MODEL_VARIANT_UN"
          + "SPECIFIED\020\000\022\026\n\022USE_BEST_AVAILABLE\020\001\022\020\n\014U"
          + "SE_STANDARD\020\002\022\020\n\014USE_ENHANCED\020\003*\215\001\n\017Ssml"
          + "VoiceGender\022!\n\035SSML_VOICE_GENDER_UNSPECI"
          + "FIED\020\000\022\032\n\026SSML_VOICE_GENDER_MALE\020\001\022\034\n\030SS"
          + "ML_VOICE_GENDER_FEMALE\020\002\022\035\n\031SSML_VOICE_G"
          + "ENDER_NEUTRAL\020\003*\354\001\n\023OutputAudioEncoding\022"
          + "%\n!OUTPUT_AUDIO_ENCODING_UNSPECIFIED\020\000\022#"
          + "\n\037OUTPUT_AUDIO_ENCODING_LINEAR_16\020\001\022\035\n\031O"
          + "UTPUT_AUDIO_ENCODING_MP3\020\002\022%\n!OUTPUT_AUD"
          + "IO_ENCODING_MP3_64_KBPS\020\004\022\"\n\036OUTPUT_AUDI"
          + "O_ENCODING_OGG_OPUS\020\003\022\037\n\033OUTPUT_AUDIO_EN"
          + "CODING_MULAW\020\005B\326\002\n\036com.google.cloud.dial"
          + "ogflow.v2B\020AudioConfigProtoP\001Z>cloud.goo"
          + "gle.com/go/dialogflow/apiv2/dialogflowpb"
          + ";dialogflowpb\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dia"
          + "logflow.V2\352AU\n\033automl.googleapis.com/Mod"
          + "el\0226projects/{project}/locations/{locati"
          + "on}/models/{model}\352Ab\n\037speech.googleapis"
          + ".com/PhraseSet\022?projects/{project}/locat"
          + "ions/{location}/phraseSets/{phrase_set}b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_v2_SpeechContext_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_SpeechContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SpeechContext_descriptor,
            new java.lang.String[] {
              "Phrases", "Boost",
            });
    internal_static_google_cloud_dialogflow_v2_SpeechWordInfo_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_SpeechWordInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SpeechWordInfo_descriptor,
            new java.lang.String[] {
              "Word", "StartOffset", "EndOffset", "Confidence",
            });
    internal_static_google_cloud_dialogflow_v2_InputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_InputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_InputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding",
              "SampleRateHertz",
              "LanguageCode",
              "EnableWordInfo",
              "PhraseHints",
              "SpeechContexts",
              "Model",
              "ModelVariant",
              "SingleUtterance",
              "DisableNoSpeechRecognizedEvent",
              "EnableAutomaticPunctuation",
            });
    internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_VoiceSelectionParams_descriptor,
            new java.lang.String[] {
              "Name", "SsmlGender",
            });
    internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SynthesizeSpeechConfig_descriptor,
            new java.lang.String[] {
              "SpeakingRate", "Pitch", "VolumeGainDb", "EffectsProfileId", "Voice",
            });
    internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_OutputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding", "SampleRateHertz", "SynthesizeSpeechConfig",
            });
    internal_static_google_cloud_dialogflow_v2_TelephonyDtmfEvents_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_TelephonyDtmfEvents_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_TelephonyDtmfEvents_descriptor,
            new java.lang.String[] {
              "DtmfEvents",
            });
    internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_SpeechToTextConfig_descriptor,
            new java.lang.String[] {
              "SpeechModelVariant", "Model", "UseTimeoutBasedEndpointing",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
