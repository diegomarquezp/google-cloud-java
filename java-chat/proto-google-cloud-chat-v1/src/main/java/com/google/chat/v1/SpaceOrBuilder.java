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
// source: google/chat/v1/space.proto

// Protobuf Java Version: 3.25.2
package com.google.chat.v1;

public interface SpaceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.Space)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the space.
   *
   * Format: `spaces/{space}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Resource name of the space.
   *
   * Format: `spaces/{space}`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Deprecated: Use `space_type` instead.
   * The type of a space.
   * </pre>
   *
   * <code>
   * .google.chat.v1.Space.Type type = 2 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @deprecated google.chat.v1.Space.type is deprecated. See google/chat/v1/space.proto;l=110
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Deprecated
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. Deprecated: Use `space_type` instead.
   * The type of a space.
   * </pre>
   *
   * <code>
   * .google.chat.v1.Space.Type type = 2 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @deprecated google.chat.v1.Space.type is deprecated. See google/chat/v1/space.proto;l=110
   * @return The type.
   */
  @java.lang.Deprecated
  com.google.chat.v1.Space.Type getType();

  /**
   *
   *
   * <pre>
   * The type of space. Required when creating a space or updating the space
   * type of a space. Output only for other usage.
   * </pre>
   *
   * <code>.google.chat.v1.Space.SpaceType space_type = 10;</code>
   *
   * @return The enum numeric value on the wire for spaceType.
   */
  int getSpaceTypeValue();
  /**
   *
   *
   * <pre>
   * The type of space. Required when creating a space or updating the space
   * type of a space. Output only for other usage.
   * </pre>
   *
   * <code>.google.chat.v1.Space.SpaceType space_type = 10;</code>
   *
   * @return The spaceType.
   */
  com.google.chat.v1.Space.SpaceType getSpaceType();

  /**
   *
   *
   * <pre>
   * Optional. Whether the space is a DM between a Chat app and a single
   * human.
   * </pre>
   *
   * <code>bool single_user_bot_dm = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The singleUserBotDm.
   */
  boolean getSingleUserBotDm();

  /**
   *
   *
   * <pre>
   * Output only. Deprecated: Use `spaceThreadingState` instead.
   * Whether messages are threaded in this space.
   * </pre>
   *
   * <code>bool threaded = 5 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @deprecated google.chat.v1.Space.threaded is deprecated. See google/chat/v1/space.proto;l=122
   * @return The threaded.
   */
  @java.lang.Deprecated
  boolean getThreaded();

  /**
   *
   *
   * <pre>
   * The space's display name. Required when [creating a
   * space](https://developers.google.com/chat/api/reference/rest/v1/spaces/create).
   * If you receive the error message `ALREADY_EXISTS` when creating a space or
   * updating the `displayName`, try a different `displayName`. An
   * existing space within the Google Workspace organization might already use
   * this display name.
   *
   * For direct messages, this field might be empty.
   *
   * Supports up to 128 characters.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The space's display name. Required when [creating a
   * space](https://developers.google.com/chat/api/reference/rest/v1/spaces/create).
   * If you receive the error message `ALREADY_EXISTS` when creating a space or
   * updating the `displayName`, try a different `displayName`. An
   * existing space within the Google Workspace organization might already use
   * this display name.
   *
   * For direct messages, this field might be empty.
   *
   * Supports up to 128 characters.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Immutable. Whether this space permits any Google Chat user as a member.
   * Input when creating a space in a Google Workspace organization. Omit this
   * field when creating spaces in the following conditions:
   *
   *   * The authenticated user uses a Google Account. By default,
   *     the space permits any Google Chat user.
   *
   *   * The space is used to [import data to Google Chat]
   *     (https://developers.google.com/chat/api/guides/import-data-overview).
   *     Import mode spaces must only permit members from the same Google
   *     Workspace organization.
   *
   * For existing spaces, this field is output only.
   * </pre>
   *
   * <code>bool external_user_allowed = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The externalUserAllowed.
   */
  boolean getExternalUserAllowed();

  /**
   *
   *
   * <pre>
   * Output only. The threading state in the Chat space.
   * </pre>
   *
   * <code>
   * .google.chat.v1.Space.SpaceThreadingState space_threading_state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for spaceThreadingState.
   */
  int getSpaceThreadingStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The threading state in the Chat space.
   * </pre>
   *
   * <code>
   * .google.chat.v1.Space.SpaceThreadingState space_threading_state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The spaceThreadingState.
   */
  com.google.chat.v1.Space.SpaceThreadingState getSpaceThreadingState();

  /**
   *
   *
   * <pre>
   * Details about the space including description and rules.
   * </pre>
   *
   * <code>.google.chat.v1.Space.SpaceDetails space_details = 11;</code>
   *
   * @return Whether the spaceDetails field is set.
   */
  boolean hasSpaceDetails();
  /**
   *
   *
   * <pre>
   * Details about the space including description and rules.
   * </pre>
   *
   * <code>.google.chat.v1.Space.SpaceDetails space_details = 11;</code>
   *
   * @return The spaceDetails.
   */
  com.google.chat.v1.Space.SpaceDetails getSpaceDetails();
  /**
   *
   *
   * <pre>
   * Details about the space including description and rules.
   * </pre>
   *
   * <code>.google.chat.v1.Space.SpaceDetails space_details = 11;</code>
   */
  com.google.chat.v1.Space.SpaceDetailsOrBuilder getSpaceDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * The message history state for messages and threads in this space.
   * </pre>
   *
   * <code>.google.chat.v1.HistoryState space_history_state = 13;</code>
   *
   * @return The enum numeric value on the wire for spaceHistoryState.
   */
  int getSpaceHistoryStateValue();
  /**
   *
   *
   * <pre>
   * The message history state for messages and threads in this space.
   * </pre>
   *
   * <code>.google.chat.v1.HistoryState space_history_state = 13;</code>
   *
   * @return The spaceHistoryState.
   */
  com.google.chat.v1.HistoryState getSpaceHistoryState();

  /**
   *
   *
   * <pre>
   * Optional. Whether this space is created in `Import Mode` as part of a data
   * migration into Google Workspace. While spaces are being imported, they
   * aren't visible to users until the import is complete.
   * </pre>
   *
   * <code>bool import_mode = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The importMode.
   */
  boolean getImportMode();

  /**
   *
   *
   * <pre>
   * Optional. Immutable. For spaces created in Chat, the time the space was
   * created. This field is output only, except when used in import mode spaces.
   *
   * For import mode spaces, set this field to the historical timestamp at which
   * the space was created in the source in order to preserve the original
   * creation time.
   *
   * Only populated in the output when `spaceType` is `GROUP_CHAT` or `SPACE`.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp create_time = 17 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Optional. Immutable. For spaces created in Chat, the time the space was
   * created. This field is output only, except when used in import mode spaces.
   *
   * For import mode spaces, set this field to the historical timestamp at which
   * the space was created in the source in order to preserve the original
   * creation time.
   *
   * Only populated in the output when `spaceType` is `GROUP_CHAT` or `SPACE`.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp create_time = 17 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Optional. Immutable. For spaces created in Chat, the time the space was
   * created. This field is output only, except when used in import mode spaces.
   *
   * For import mode spaces, set this field to the historical timestamp at which
   * the space was created in the source in order to preserve the original
   * creation time.
   *
   * Only populated in the output when `spaceType` is `GROUP_CHAT` or `SPACE`.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp create_time = 17 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Whether the Chat app was installed by a Google Workspace
   * administrator. Administrators can install a Chat app for their domain,
   * organizational unit, or a group of users.
   *
   * Administrators can only install Chat apps for direct messaging between
   * users and the app. To support admin install, your app must feature direct
   * messaging.
   * </pre>
   *
   * <code>bool admin_installed = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The adminInstalled.
   */
  boolean getAdminInstalled();
}
