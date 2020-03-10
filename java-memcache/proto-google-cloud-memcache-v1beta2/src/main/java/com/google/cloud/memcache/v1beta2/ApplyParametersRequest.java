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
// source: google/cloud/memcache/v1beta2/cloud_memcache.proto

package com.google.cloud.memcache.v1beta2;

/**
 *
 *
 * <pre>
 * Request for [ApplyParameters][google.cloud.memcache.v1beta2.CloudMemcache.ApplyParameters].
 * </pre>
 *
 * Protobuf type {@code google.cloud.memcache.v1beta2.ApplyParametersRequest}
 */
public final class ApplyParametersRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.memcache.v1beta2.ApplyParametersRequest)
    ApplyParametersRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ApplyParametersRequest.newBuilder() to construct.
  private ApplyParametersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApplyParametersRequest() {
    name_ = "";
    nodeIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ApplyParametersRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ApplyParametersRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                nodeIds_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              nodeIds_.add(s);
              break;
            }
          case 24:
            {
              applyAll_ = input.readBool();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        nodeIds_ = nodeIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.memcache.v1beta2.CloudMemcacheProto
        .internal_static_google_cloud_memcache_v1beta2_ApplyParametersRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.memcache.v1beta2.CloudMemcacheProto
        .internal_static_google_cloud_memcache_v1beta2_ApplyParametersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.memcache.v1beta2.ApplyParametersRequest.class,
            com.google.cloud.memcache.v1beta2.ApplyParametersRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. Resource name of the Memcached instance for which parameter group updates
   * should be applied.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Resource name of the Memcached instance for which parameter group updates
   * should be applied.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NODE_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList nodeIds_;
  /**
   *
   *
   * <pre>
   * Nodes to which we should apply the instance-level parameter group.
   * </pre>
   *
   * <code>repeated string node_ids = 2;</code>
   *
   * @return A list containing the nodeIds.
   */
  public com.google.protobuf.ProtocolStringList getNodeIdsList() {
    return nodeIds_;
  }
  /**
   *
   *
   * <pre>
   * Nodes to which we should apply the instance-level parameter group.
   * </pre>
   *
   * <code>repeated string node_ids = 2;</code>
   *
   * @return The count of nodeIds.
   */
  public int getNodeIdsCount() {
    return nodeIds_.size();
  }
  /**
   *
   *
   * <pre>
   * Nodes to which we should apply the instance-level parameter group.
   * </pre>
   *
   * <code>repeated string node_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The nodeIds at the given index.
   */
  public java.lang.String getNodeIds(int index) {
    return nodeIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Nodes to which we should apply the instance-level parameter group.
   * </pre>
   *
   * <code>repeated string node_ids = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the nodeIds at the given index.
   */
  public com.google.protobuf.ByteString getNodeIdsBytes(int index) {
    return nodeIds_.getByteString(index);
  }

  public static final int APPLY_ALL_FIELD_NUMBER = 3;
  private boolean applyAll_;
  /**
   *
   *
   * <pre>
   * Whether to apply instance-level parameter group to all nodes. If set to
   * true, will explicitly restrict users from specifying any nodes, and apply
   * parameter group updates to all nodes within the instance.
   * </pre>
   *
   * <code>bool apply_all = 3;</code>
   *
   * @return The applyAll.
   */
  public boolean getApplyAll() {
    return applyAll_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < nodeIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nodeIds_.getRaw(i));
    }
    if (applyAll_ != false) {
      output.writeBool(3, applyAll_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < nodeIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(nodeIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNodeIdsList().size();
    }
    if (applyAll_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, applyAll_);
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
    if (!(obj instanceof com.google.cloud.memcache.v1beta2.ApplyParametersRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.memcache.v1beta2.ApplyParametersRequest other =
        (com.google.cloud.memcache.v1beta2.ApplyParametersRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getNodeIdsList().equals(other.getNodeIdsList())) return false;
    if (getApplyAll() != other.getApplyAll()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getNodeIdsCount() > 0) {
      hash = (37 * hash) + NODE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getNodeIdsList().hashCode();
    }
    hash = (37 * hash) + APPLY_ALL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getApplyAll());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.memcache.v1beta2.ApplyParametersRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.memcache.v1beta2.ApplyParametersRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.memcache.v1beta2.ApplyParametersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.memcache.v1beta2.ApplyParametersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.memcache.v1beta2.ApplyParametersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.memcache.v1beta2.ApplyParametersRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.memcache.v1beta2.ApplyParametersRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.memcache.v1beta2.ApplyParametersRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.memcache.v1beta2.ApplyParametersRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.memcache.v1beta2.ApplyParametersRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.memcache.v1beta2.ApplyParametersRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.memcache.v1beta2.ApplyParametersRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.memcache.v1beta2.ApplyParametersRequest prototype) {
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
   * Request for [ApplyParameters][google.cloud.memcache.v1beta2.CloudMemcache.ApplyParameters].
   * </pre>
   *
   * Protobuf type {@code google.cloud.memcache.v1beta2.ApplyParametersRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.memcache.v1beta2.ApplyParametersRequest)
      com.google.cloud.memcache.v1beta2.ApplyParametersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.memcache.v1beta2.CloudMemcacheProto
          .internal_static_google_cloud_memcache_v1beta2_ApplyParametersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.memcache.v1beta2.CloudMemcacheProto
          .internal_static_google_cloud_memcache_v1beta2_ApplyParametersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.memcache.v1beta2.ApplyParametersRequest.class,
              com.google.cloud.memcache.v1beta2.ApplyParametersRequest.Builder.class);
    }

    // Construct using com.google.cloud.memcache.v1beta2.ApplyParametersRequest.newBuilder()
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
      name_ = "";

      nodeIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      applyAll_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.memcache.v1beta2.CloudMemcacheProto
          .internal_static_google_cloud_memcache_v1beta2_ApplyParametersRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.memcache.v1beta2.ApplyParametersRequest getDefaultInstanceForType() {
      return com.google.cloud.memcache.v1beta2.ApplyParametersRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.memcache.v1beta2.ApplyParametersRequest build() {
      com.google.cloud.memcache.v1beta2.ApplyParametersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.memcache.v1beta2.ApplyParametersRequest buildPartial() {
      com.google.cloud.memcache.v1beta2.ApplyParametersRequest result =
          new com.google.cloud.memcache.v1beta2.ApplyParametersRequest(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (((bitField0_ & 0x00000001) != 0)) {
        nodeIds_ = nodeIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.nodeIds_ = nodeIds_;
      result.applyAll_ = applyAll_;
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
      if (other instanceof com.google.cloud.memcache.v1beta2.ApplyParametersRequest) {
        return mergeFrom((com.google.cloud.memcache.v1beta2.ApplyParametersRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.memcache.v1beta2.ApplyParametersRequest other) {
      if (other == com.google.cloud.memcache.v1beta2.ApplyParametersRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.nodeIds_.isEmpty()) {
        if (nodeIds_.isEmpty()) {
          nodeIds_ = other.nodeIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNodeIdsIsMutable();
          nodeIds_.addAll(other.nodeIds_);
        }
        onChanged();
      }
      if (other.getApplyAll() != false) {
        setApplyAll(other.getApplyAll());
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
      com.google.cloud.memcache.v1beta2.ApplyParametersRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.memcache.v1beta2.ApplyParametersRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Resource name of the Memcached instance for which parameter group updates
     * should be applied.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the Memcached instance for which parameter group updates
     * should be applied.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the Memcached instance for which parameter group updates
     * should be applied.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the Memcached instance for which parameter group updates
     * should be applied.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource name of the Memcached instance for which parameter group updates
     * should be applied.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList nodeIds_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureNodeIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nodeIds_ = new com.google.protobuf.LazyStringArrayList(nodeIds_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Nodes to which we should apply the instance-level parameter group.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @return A list containing the nodeIds.
     */
    public com.google.protobuf.ProtocolStringList getNodeIdsList() {
      return nodeIds_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Nodes to which we should apply the instance-level parameter group.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @return The count of nodeIds.
     */
    public int getNodeIdsCount() {
      return nodeIds_.size();
    }
    /**
     *
     *
     * <pre>
     * Nodes to which we should apply the instance-level parameter group.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The nodeIds at the given index.
     */
    public java.lang.String getNodeIds(int index) {
      return nodeIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Nodes to which we should apply the instance-level parameter group.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the nodeIds at the given index.
     */
    public com.google.protobuf.ByteString getNodeIdsBytes(int index) {
      return nodeIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Nodes to which we should apply the instance-level parameter group.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The nodeIds to set.
     * @return This builder for chaining.
     */
    public Builder setNodeIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNodeIdsIsMutable();
      nodeIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Nodes to which we should apply the instance-level parameter group.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @param value The nodeIds to add.
     * @return This builder for chaining.
     */
    public Builder addNodeIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNodeIdsIsMutable();
      nodeIds_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Nodes to which we should apply the instance-level parameter group.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @param values The nodeIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllNodeIds(java.lang.Iterable<java.lang.String> values) {
      ensureNodeIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, nodeIds_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Nodes to which we should apply the instance-level parameter group.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNodeIds() {
      nodeIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Nodes to which we should apply the instance-level parameter group.
     * </pre>
     *
     * <code>repeated string node_ids = 2;</code>
     *
     * @param value The bytes of the nodeIds to add.
     * @return This builder for chaining.
     */
    public Builder addNodeIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureNodeIdsIsMutable();
      nodeIds_.add(value);
      onChanged();
      return this;
    }

    private boolean applyAll_;
    /**
     *
     *
     * <pre>
     * Whether to apply instance-level parameter group to all nodes. If set to
     * true, will explicitly restrict users from specifying any nodes, and apply
     * parameter group updates to all nodes within the instance.
     * </pre>
     *
     * <code>bool apply_all = 3;</code>
     *
     * @return The applyAll.
     */
    public boolean getApplyAll() {
      return applyAll_;
    }
    /**
     *
     *
     * <pre>
     * Whether to apply instance-level parameter group to all nodes. If set to
     * true, will explicitly restrict users from specifying any nodes, and apply
     * parameter group updates to all nodes within the instance.
     * </pre>
     *
     * <code>bool apply_all = 3;</code>
     *
     * @param value The applyAll to set.
     * @return This builder for chaining.
     */
    public Builder setApplyAll(boolean value) {

      applyAll_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether to apply instance-level parameter group to all nodes. If set to
     * true, will explicitly restrict users from specifying any nodes, and apply
     * parameter group updates to all nodes within the instance.
     * </pre>
     *
     * <code>bool apply_all = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearApplyAll() {

      applyAll_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.memcache.v1beta2.ApplyParametersRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.memcache.v1beta2.ApplyParametersRequest)
  private static final com.google.cloud.memcache.v1beta2.ApplyParametersRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.memcache.v1beta2.ApplyParametersRequest();
  }

  public static com.google.cloud.memcache.v1beta2.ApplyParametersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApplyParametersRequest> PARSER =
      new com.google.protobuf.AbstractParser<ApplyParametersRequest>() {
        @java.lang.Override
        public ApplyParametersRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ApplyParametersRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ApplyParametersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplyParametersRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.memcache.v1beta2.ApplyParametersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
