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
// source: google/cloud/notebooks/v1/service.proto

package com.google.cloud.notebooks.v1;

/**
 *
 *
 * <pre>
 * Request for adding/changing metadata items  for an instance.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest}
 */
public final class UpdateInstanceMetadataItemsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest)
    UpdateInstanceMetadataItemsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateInstanceMetadataItemsRequest.newBuilder() to construct.
  private UpdateInstanceMetadataItemsRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateInstanceMetadataItemsRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateInstanceMetadataItemsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateInstanceMetadataItemsRequest(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                items_ =
                    com.google.protobuf.MapField.newMapField(ItemsDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String> items__ =
                  input.readMessage(
                      ItemsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              items_.getMutableMap().put(items__.getKey(), items__.getValue());
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
    return com.google.cloud.notebooks.v1.NotebooksProto
        .internal_static_google_cloud_notebooks_v1_UpdateInstanceMetadataItemsRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 2:
        return internalGetItems();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.NotebooksProto
        .internal_static_google_cloud_notebooks_v1_UpdateInstanceMetadataItemsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest.class,
            com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  @java.lang.Override
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
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
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

  public static final int ITEMS_FIELD_NUMBER = 2;

  private static final class ItemsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.notebooks.v1.NotebooksProto
                .internal_static_google_cloud_notebooks_v1_UpdateInstanceMetadataItemsRequest_ItemsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> items_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetItems() {
    if (items_ == null) {
      return com.google.protobuf.MapField.emptyMapField(ItemsDefaultEntryHolder.defaultEntry);
    }
    return items_;
  }

  public int getItemsCount() {
    return internalGetItems().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Metadata items to add/update for the instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; items = 2;</code>
   */
  @java.lang.Override
  public boolean containsItems(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    return internalGetItems().getMap().containsKey(key);
  }
  /** Use {@link #getItemsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getItems() {
    return getItemsMap();
  }
  /**
   *
   *
   * <pre>
   * Metadata items to add/update for the instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; items = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getItemsMap() {
    return internalGetItems().getMap();
  }
  /**
   *
   *
   * <pre>
   * Metadata items to add/update for the instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; items = 2;</code>
   */
  @java.lang.Override
  public java.lang.String getItemsOrDefault(java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetItems().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Metadata items to add/update for the instance.
   * </pre>
   *
   * <code>map&lt;string, string&gt; items = 2;</code>
   */
  @java.lang.Override
  public java.lang.String getItemsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new java.lang.NullPointerException();
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetItems().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetItems(), ItemsDefaultEntryHolder.defaultEntry, 2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetItems().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> items__ =
          ItemsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items__);
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
    if (!(obj instanceof com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest other =
        (com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!internalGetItems().equals(other.internalGetItems())) return false;
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
    if (!internalGetItems().getMap().isEmpty()) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetItems().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest parseFrom(
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
      com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest prototype) {
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
   * Request for adding/changing metadata items  for an instance.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest)
      com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1_UpdateInstanceMetadataItemsRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetItems();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 2:
          return internalGetMutableItems();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1_UpdateInstanceMetadataItemsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest.class,
              com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest.newBuilder()
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

      internalGetMutableItems().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1_UpdateInstanceMetadataItemsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest
        getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest build() {
      com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest buildPartial() {
      com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest result =
          new com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.items_ = internalGetItems();
      result.items_.makeImmutable();
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
      if (other instanceof com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest) {
        return mergeFrom((com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest other) {
      if (other
          == com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      internalGetMutableItems().mergeFrom(other.internalGetItems());
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
      com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest)
                e.getUnfinishedMessage();
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
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> items_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetItems() {
      if (items_ == null) {
        return com.google.protobuf.MapField.emptyMapField(ItemsDefaultEntryHolder.defaultEntry);
      }
      return items_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableItems() {
      onChanged();
      ;
      if (items_ == null) {
        items_ = com.google.protobuf.MapField.newMapField(ItemsDefaultEntryHolder.defaultEntry);
      }
      if (!items_.isMutable()) {
        items_ = items_.copy();
      }
      return items_;
    }

    public int getItemsCount() {
      return internalGetItems().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Metadata items to add/update for the instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; items = 2;</code>
     */
    @java.lang.Override
    public boolean containsItems(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetItems().getMap().containsKey(key);
    }
    /** Use {@link #getItemsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getItems() {
      return getItemsMap();
    }
    /**
     *
     *
     * <pre>
     * Metadata items to add/update for the instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; items = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getItemsMap() {
      return internalGetItems().getMap();
    }
    /**
     *
     *
     * <pre>
     * Metadata items to add/update for the instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; items = 2;</code>
     */
    @java.lang.Override
    public java.lang.String getItemsOrDefault(java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetItems().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Metadata items to add/update for the instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; items = 2;</code>
     */
    @java.lang.Override
    public java.lang.String getItemsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetItems().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearItems() {
      internalGetMutableItems().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata items to add/update for the instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; items = 2;</code>
     */
    public Builder removeItems(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableItems().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableItems() {
      return internalGetMutableItems().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Metadata items to add/update for the instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; items = 2;</code>
     */
    public Builder putItems(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      if (value == null) {
        throw new java.lang.NullPointerException();
      }
      internalGetMutableItems().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata items to add/update for the instance.
     * </pre>
     *
     * <code>map&lt;string, string&gt; items = 2;</code>
     */
    public Builder putAllItems(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableItems().getMutableMap().putAll(values);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest)
  private static final com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest();
  }

  public static com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateInstanceMetadataItemsRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateInstanceMetadataItemsRequest>() {
        @java.lang.Override
        public UpdateInstanceMetadataItemsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateInstanceMetadataItemsRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateInstanceMetadataItemsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateInstanceMetadataItemsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
