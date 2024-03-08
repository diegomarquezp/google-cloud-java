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
// source: google/chat/v1/chat_service.proto

// Protobuf Java Version: 3.25.2
package com.google.chat.v1;

public final class ChatServiceProto {
  private ChatServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n!google/chat/v1/chat_service.proto\022\016goo"
          + "gle.chat.v1\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/chat/"
          + "v1/attachment.proto\032\037google/chat/v1/memb"
          + "ership.proto\032\034google/chat/v1/message.pro"
          + "to\032\035google/chat/v1/reaction.proto\032\032googl"
          + "e/chat/v1/space.proto\032 google/chat/v1/sp"
          + "ace_setup.proto\032\033google/protobuf/empty.p"
          + "roto2\232\036\n\013ChatService\022\233\001\n\rCreateMessage\022$"
          + ".google.chat.v1.CreateMessageRequest\032\027.g"
          + "oogle.chat.v1.Message\"K\332A\031parent,message"
          + ",message_id\202\323\344\223\002)\"\036/v1/{parent=spaces/*}"
          + "/messages:\007message\022\212\001\n\014ListMessages\022#.go"
          + "ogle.chat.v1.ListMessagesRequest\032$.googl"
          + "e.chat.v1.ListMessagesResponse\"/\332A\006paren"
          + "t\202\323\344\223\002 \022\036/v1/{parent=spaces/*}/messages\022"
          + "\222\001\n\017ListMemberships\022&.google.chat.v1.Lis"
          + "tMembershipsRequest\032\'.google.chat.v1.Lis"
          + "tMembershipsResponse\".\332A\006parent\202\323\344\223\002\037\022\035/"
          + "v1/{parent=spaces/*}/members\022\177\n\rGetMembe"
          + "rship\022$.google.chat.v1.GetMembershipRequ"
          + "est\032\032.google.chat.v1.Membership\",\332A\004name"
          + "\202\323\344\223\002\037\022\035/v1/{name=spaces/*/members/*}\022w\n"
          + "\nGetMessage\022!.google.chat.v1.GetMessageR"
          + "equest\032\027.google.chat.v1.Message\"-\332A\004name"
          + "\202\323\344\223\002 \022\036/v1/{name=spaces/*/messages/*}\022\321"
          + "\001\n\rUpdateMessage\022$.google.chat.v1.Update"
          + "MessageRequest\032\027.google.chat.v1.Message\""
          + "\200\001\332A\023message,update_mask\202\323\344\223\002d\032&/v1/{mes"
          + "sage.name=spaces/*/messages/*}:\007messageZ"
          + "12&/v1/{message.name=spaces/*/messages/*"
          + "}:\007message\022|\n\rDeleteMessage\022$.google.cha"
          + "t.v1.DeleteMessageRequest\032\026.google.proto"
          + "buf.Empty\"-\332A\004name\202\323\344\223\002 *\036/v1/{name=spac"
          + "es/*/messages/*}\022\216\001\n\rGetAttachment\022$.goo"
          + "gle.chat.v1.GetAttachmentRequest\032\032.googl"
          + "e.chat.v1.Attachment\";\332A\004name\202\323\344\223\002.\022,/v1"
          + "/{name=spaces/*/messages/*/attachments/*"
          + "}\022\232\001\n\020UploadAttachment\022\'.google.chat.v1."
          + "UploadAttachmentRequest\032(.google.chat.v1"
          + ".UploadAttachmentResponse\"3\202\323\344\223\002-\"(/v1/{"
          + "parent=spaces/*}/attachments:upload:\001*\022j"
          + "\n\nListSpaces\022!.google.chat.v1.ListSpaces"
          + "Request\032\".google.chat.v1.ListSpacesRespo"
          + "nse\"\025\332A\000\202\323\344\223\002\014\022\n/v1/spaces\022f\n\010GetSpace\022\037"
          + ".google.chat.v1.GetSpaceRequest\032\025.google"
          + ".chat.v1.Space\"\"\332A\004name\202\323\344\223\002\025\022\023/v1/{name"
          + "=spaces/*}\022k\n\013CreateSpace\022\".google.chat."
          + "v1.CreateSpaceRequest\032\025.google.chat.v1.S"
          + "pace\"!\332A\005space\202\323\344\223\002\023\"\n/v1/spaces:\005space\022"
          + "c\n\nSetUpSpace\022!.google.chat.v1.SetUpSpac"
          + "eRequest\032\025.google.chat.v1.Space\"\033\202\323\344\223\002\025\""
          + "\020/v1/spaces:setup:\001*\022\206\001\n\013UpdateSpace\022\".g"
          + "oogle.chat.v1.UpdateSpaceRequest\032\025.googl"
          + "e.chat.v1.Space\"<\332A\021space,update_mask\202\323\344"
          + "\223\002\"2\031/v1/{space.name=spaces/*}:\005space\022m\n"
          + "\013DeleteSpace\022\".google.chat.v1.DeleteSpac"
          + "eRequest\032\026.google.protobuf.Empty\"\"\332A\004nam"
          + "e\202\323\344\223\002\025*\023/v1/{name=spaces/*}\022\235\001\n\023Complet"
          + "eImportSpace\022*.google.chat.v1.CompleteIm"
          + "portSpaceRequest\032+.google.chat.v1.Comple"
          + "teImportSpaceResponse\"-\202\323\344\223\002\'\"\"/v1/{name"
          + "=spaces/*}:completeImport:\001*\022z\n\021FindDire"
          + "ctMessage\022(.google.chat.v1.FindDirectMes"
          + "sageRequest\032\025.google.chat.v1.Space\"$\202\323\344\223"
          + "\002\036\022\034/v1/spaces:findDirectMessage\022\236\001\n\020Cre"
          + "ateMembership\022\'.google.chat.v1.CreateMem"
          + "bershipRequest\032\032.google.chat.v1.Membersh"
          + "ip\"E\332A\021parent,membership\202\323\344\223\002+\"\035/v1/{par"
          + "ent=spaces/*}/members:\nmembership\022\205\001\n\020De"
          + "leteMembership\022\'.google.chat.v1.DeleteMe"
          + "mbershipRequest\032\032.google.chat.v1.Members"
          + "hip\",\332A\004name\202\323\344\223\002\037*\035/v1/{name=spaces/*/m"
          + "embers/*}\022\241\001\n\016CreateReaction\022%.google.ch"
          + "at.v1.CreateReactionRequest\032\030.google.cha"
          + "t.v1.Reaction\"N\332A\017parent,reaction\202\323\344\223\0026\""
          + "*/v1/{parent=spaces/*/messages/*}/reacti"
          + "ons:\010reaction\022\231\001\n\rListReactions\022$.google"
          + ".chat.v1.ListReactionsRequest\032%.google.c"
          + "hat.v1.ListReactionsResponse\";\332A\006parent\202"
          + "\323\344\223\002,\022*/v1/{parent=spaces/*/messages/*}/"
          + "reactions\022\212\001\n\016DeleteReaction\022%.google.ch"
          + "at.v1.DeleteReactionRequest\032\026.google.pro"
          + "tobuf.Empty\"9\332A\004name\202\323\344\223\002,**/v1/{name=sp"
          + "aces/*/messages/*/reactions/*}\032\240\006\312A\023chat"
          + ".googleapis.com\322A\206\006https://www.googleapi"
          + "s.com/auth/chat.bot,https://www.googleap"
          + "is.com/auth/chat.delete,https://www.goog"
          + "leapis.com/auth/chat.import,https://www."
          + "googleapis.com/auth/chat.memberships,htt"
          + "ps://www.googleapis.com/auth/chat.member"
          + "ships.app,https://www.googleapis.com/aut"
          + "h/chat.memberships.readonly,https://www."
          + "googleapis.com/auth/chat.messages,https:"
          + "//www.googleapis.com/auth/chat.messages."
          + "create,https://www.googleapis.com/auth/c"
          + "hat.messages.reactions,https://www.googl"
          + "eapis.com/auth/chat.messages.reactions.c"
          + "reate,https://www.googleapis.com/auth/ch"
          + "at.messages.reactions.readonly,https://w"
          + "ww.googleapis.com/auth/chat.messages.rea"
          + "donly,https://www.googleapis.com/auth/ch"
          + "at.spaces,https://www.googleapis.com/aut"
          + "h/chat.spaces.create,https://www.googlea"
          + "pis.com/auth/chat.spaces.readonlyB\233\001\n\022co"
          + "m.google.chat.v1B\020ChatServiceProtoP\001Z,cl"
          + "oud.google.com/go/chat/apiv1/chatpb;chat"
          + "pb\252\002\023Google.Apps.Chat.V1\312\002\023Google\\Apps\\C"
          + "hat\\V1\352\002\026Google::Apps::Chat::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.chat.v1.AttachmentProto.getDescriptor(),
              com.google.chat.v1.MembershipProto.getDescriptor(),
              com.google.chat.v1.MessageProto.getDescriptor(),
              com.google.chat.v1.ReactionProto.getDescriptor(),
              com.google.chat.v1.SpaceProto.getDescriptor(),
              com.google.chat.v1.SpaceSetupProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.chat.v1.AttachmentProto.getDescriptor();
    com.google.chat.v1.MembershipProto.getDescriptor();
    com.google.chat.v1.MessageProto.getDescriptor();
    com.google.chat.v1.ReactionProto.getDescriptor();
    com.google.chat.v1.SpaceProto.getDescriptor();
    com.google.chat.v1.SpaceSetupProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
