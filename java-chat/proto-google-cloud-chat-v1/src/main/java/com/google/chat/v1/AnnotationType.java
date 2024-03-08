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
// source: google/chat/v1/annotation.proto

// Protobuf Java Version: 3.25.2
package com.google.chat.v1;

/**
 *
 *
 * <pre>
 * Type of the annotation.
 * </pre>
 *
 * Protobuf enum {@code google.chat.v1.AnnotationType}
 */
public enum AnnotationType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default value for the enum. Don't use.
   * </pre>
   *
   * <code>ANNOTATION_TYPE_UNSPECIFIED = 0;</code>
   */
  ANNOTATION_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * A user is mentioned.
   * </pre>
   *
   * <code>USER_MENTION = 1;</code>
   */
  USER_MENTION(1),
  /**
   *
   *
   * <pre>
   * A slash command is invoked.
   * </pre>
   *
   * <code>SLASH_COMMAND = 2;</code>
   */
  SLASH_COMMAND(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default value for the enum. Don't use.
   * </pre>
   *
   * <code>ANNOTATION_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ANNOTATION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * A user is mentioned.
   * </pre>
   *
   * <code>USER_MENTION = 1;</code>
   */
  public static final int USER_MENTION_VALUE = 1;
  /**
   *
   *
   * <pre>
   * A slash command is invoked.
   * </pre>
   *
   * <code>SLASH_COMMAND = 2;</code>
   */
  public static final int SLASH_COMMAND_VALUE = 2;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AnnotationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AnnotationType forNumber(int value) {
    switch (value) {
      case 0:
        return ANNOTATION_TYPE_UNSPECIFIED;
      case 1:
        return USER_MENTION;
      case 2:
        return SLASH_COMMAND;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AnnotationType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<AnnotationType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<AnnotationType>() {
        public AnnotationType findValueByNumber(int number) {
          return AnnotationType.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.chat.v1.AnnotationProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final AnnotationType[] VALUES = values();

  public static AnnotationType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AnnotationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.chat.v1.AnnotationType)
}
