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

/**
 *
 *
 * <pre>
 * AcceleratorConfig represents a Hardware Accelerator request.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.AcceleratorConfig}
 */
public final class AcceleratorConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.AcceleratorConfig)
    AcceleratorConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AcceleratorConfig.newBuilder() to construct.
  private AcceleratorConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AcceleratorConfig() {
    acceleratorType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AcceleratorConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AcceleratorConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              acceleratorCount_ = input.readInt64();
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              acceleratorType_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_AcceleratorConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_AcceleratorConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.AcceleratorConfig.class,
            com.google.container.v1.AcceleratorConfig.Builder.class);
  }

  public static final int ACCELERATOR_COUNT_FIELD_NUMBER = 1;
  private long acceleratorCount_;
  /**
   *
   *
   * <pre>
   * The number of the accelerator cards exposed to an instance.
   * </pre>
   *
   * <code>int64 accelerator_count = 1;</code>
   *
   * @return The acceleratorCount.
   */
  public long getAcceleratorCount() {
    return acceleratorCount_;
  }

  public static final int ACCELERATOR_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object acceleratorType_;
  /**
   *
   *
   * <pre>
   * The accelerator type resource name. List of supported accelerators
   * [here](https://cloud.google.com/compute/docs/gpus)
   * </pre>
   *
   * <code>string accelerator_type = 2;</code>
   *
   * @return The acceleratorType.
   */
  public java.lang.String getAcceleratorType() {
    java.lang.Object ref = acceleratorType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      acceleratorType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The accelerator type resource name. List of supported accelerators
   * [here](https://cloud.google.com/compute/docs/gpus)
   * </pre>
   *
   * <code>string accelerator_type = 2;</code>
   *
   * @return The bytes for acceleratorType.
   */
  public com.google.protobuf.ByteString getAcceleratorTypeBytes() {
    java.lang.Object ref = acceleratorType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      acceleratorType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (acceleratorCount_ != 0L) {
      output.writeInt64(1, acceleratorCount_);
    }
    if (!getAcceleratorTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, acceleratorType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (acceleratorCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, acceleratorCount_);
    }
    if (!getAcceleratorTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, acceleratorType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.container.v1.AcceleratorConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.AcceleratorConfig other =
        (com.google.container.v1.AcceleratorConfig) obj;

    if (getAcceleratorCount() != other.getAcceleratorCount()) return false;
    if (!getAcceleratorType().equals(other.getAcceleratorType())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ACCELERATOR_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getAcceleratorCount());
    hash = (37 * hash) + ACCELERATOR_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getAcceleratorType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.AcceleratorConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.AcceleratorConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.AcceleratorConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.container.v1.AcceleratorConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * AcceleratorConfig represents a Hardware Accelerator request.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.AcceleratorConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.AcceleratorConfig)
      com.google.container.v1.AcceleratorConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_AcceleratorConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_AcceleratorConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.AcceleratorConfig.class,
              com.google.container.v1.AcceleratorConfig.Builder.class);
    }

    // Construct using com.google.container.v1.AcceleratorConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      acceleratorCount_ = 0L;

      acceleratorType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_AcceleratorConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.AcceleratorConfig getDefaultInstanceForType() {
      return com.google.container.v1.AcceleratorConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.AcceleratorConfig build() {
      com.google.container.v1.AcceleratorConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.AcceleratorConfig buildPartial() {
      com.google.container.v1.AcceleratorConfig result =
          new com.google.container.v1.AcceleratorConfig(this);
      result.acceleratorCount_ = acceleratorCount_;
      result.acceleratorType_ = acceleratorType_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.container.v1.AcceleratorConfig) {
        return mergeFrom((com.google.container.v1.AcceleratorConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.AcceleratorConfig other) {
      if (other == com.google.container.v1.AcceleratorConfig.getDefaultInstance()) return this;
      if (other.getAcceleratorCount() != 0L) {
        setAcceleratorCount(other.getAcceleratorCount());
      }
      if (!other.getAcceleratorType().isEmpty()) {
        acceleratorType_ = other.acceleratorType_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.container.v1.AcceleratorConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1.AcceleratorConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long acceleratorCount_;
    /**
     *
     *
     * <pre>
     * The number of the accelerator cards exposed to an instance.
     * </pre>
     *
     * <code>int64 accelerator_count = 1;</code>
     *
     * @return The acceleratorCount.
     */
    public long getAcceleratorCount() {
      return acceleratorCount_;
    }
    /**
     *
     *
     * <pre>
     * The number of the accelerator cards exposed to an instance.
     * </pre>
     *
     * <code>int64 accelerator_count = 1;</code>
     *
     * @param value The acceleratorCount to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorCount(long value) {

      acceleratorCount_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of the accelerator cards exposed to an instance.
     * </pre>
     *
     * <code>int64 accelerator_count = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAcceleratorCount() {

      acceleratorCount_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object acceleratorType_ = "";
    /**
     *
     *
     * <pre>
     * The accelerator type resource name. List of supported accelerators
     * [here](https://cloud.google.com/compute/docs/gpus)
     * </pre>
     *
     * <code>string accelerator_type = 2;</code>
     *
     * @return The acceleratorType.
     */
    public java.lang.String getAcceleratorType() {
      java.lang.Object ref = acceleratorType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        acceleratorType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The accelerator type resource name. List of supported accelerators
     * [here](https://cloud.google.com/compute/docs/gpus)
     * </pre>
     *
     * <code>string accelerator_type = 2;</code>
     *
     * @return The bytes for acceleratorType.
     */
    public com.google.protobuf.ByteString getAcceleratorTypeBytes() {
      java.lang.Object ref = acceleratorType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        acceleratorType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The accelerator type resource name. List of supported accelerators
     * [here](https://cloud.google.com/compute/docs/gpus)
     * </pre>
     *
     * <code>string accelerator_type = 2;</code>
     *
     * @param value The acceleratorType to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      acceleratorType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The accelerator type resource name. List of supported accelerators
     * [here](https://cloud.google.com/compute/docs/gpus)
     * </pre>
     *
     * <code>string accelerator_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAcceleratorType() {

      acceleratorType_ = getDefaultInstance().getAcceleratorType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The accelerator type resource name. List of supported accelerators
     * [here](https://cloud.google.com/compute/docs/gpus)
     * </pre>
     *
     * <code>string accelerator_type = 2;</code>
     *
     * @param value The bytes for acceleratorType to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      acceleratorType_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.container.v1.AcceleratorConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.AcceleratorConfig)
  private static final com.google.container.v1.AcceleratorConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.AcceleratorConfig();
  }

  public static com.google.container.v1.AcceleratorConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcceleratorConfig> PARSER =
      new com.google.protobuf.AbstractParser<AcceleratorConfig>() {
        @java.lang.Override
        public AcceleratorConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AcceleratorConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AcceleratorConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcceleratorConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.AcceleratorConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
