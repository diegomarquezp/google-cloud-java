/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/netapp/v1/backup_vault.proto

package com.google.cloud.netapp.v1;

/**
 *
 *
 * <pre>
 * UpdateBackupVaultRequest updates description and/or labels for a backupVault.
 * </pre>
 *
 * Protobuf type {@code google.cloud.netapp.v1.UpdateBackupVaultRequest}
 */
public final class UpdateBackupVaultRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.netapp.v1.UpdateBackupVaultRequest)
    UpdateBackupVaultRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateBackupVaultRequest.newBuilder() to construct.
  private UpdateBackupVaultRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateBackupVaultRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateBackupVaultRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.netapp.v1.BackupVaultProto
        .internal_static_google_cloud_netapp_v1_UpdateBackupVaultRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.netapp.v1.BackupVaultProto
        .internal_static_google_cloud_netapp_v1_UpdateBackupVaultRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.netapp.v1.UpdateBackupVaultRequest.class,
            com.google.cloud.netapp.v1.UpdateBackupVaultRequest.Builder.class);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Backup resource to be updated.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Backup resource to be updated.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. Field mask is used to specify the fields to be overwritten in the
   * Backup resource to be updated.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int BACKUP_VAULT_FIELD_NUMBER = 2;
  private com.google.cloud.netapp.v1.BackupVault backupVault_;
  /**
   *
   *
   * <pre>
   * Required. The backupVault being updated
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.BackupVault backup_vault = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the backupVault field is set.
   */
  @java.lang.Override
  public boolean hasBackupVault() {
    return backupVault_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The backupVault being updated
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.BackupVault backup_vault = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The backupVault.
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1.BackupVault getBackupVault() {
    return backupVault_ == null
        ? com.google.cloud.netapp.v1.BackupVault.getDefaultInstance()
        : backupVault_;
  }
  /**
   *
   *
   * <pre>
   * Required. The backupVault being updated
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.BackupVault backup_vault = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.netapp.v1.BackupVaultOrBuilder getBackupVaultOrBuilder() {
    return backupVault_ == null
        ? com.google.cloud.netapp.v1.BackupVault.getDefaultInstance()
        : backupVault_;
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
    if (updateMask_ != null) {
      output.writeMessage(1, getUpdateMask());
    }
    if (backupVault_ != null) {
      output.writeMessage(2, getBackupVault());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUpdateMask());
    }
    if (backupVault_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getBackupVault());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.netapp.v1.UpdateBackupVaultRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.netapp.v1.UpdateBackupVaultRequest other =
        (com.google.cloud.netapp.v1.UpdateBackupVaultRequest) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (hasBackupVault() != other.hasBackupVault()) return false;
    if (hasBackupVault()) {
      if (!getBackupVault().equals(other.getBackupVault())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    if (hasBackupVault()) {
      hash = (37 * hash) + BACKUP_VAULT_FIELD_NUMBER;
      hash = (53 * hash) + getBackupVault().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.netapp.v1.UpdateBackupVaultRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.UpdateBackupVaultRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.UpdateBackupVaultRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.UpdateBackupVaultRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.UpdateBackupVaultRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.UpdateBackupVaultRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.UpdateBackupVaultRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.UpdateBackupVaultRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.UpdateBackupVaultRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.UpdateBackupVaultRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.UpdateBackupVaultRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.UpdateBackupVaultRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.netapp.v1.UpdateBackupVaultRequest prototype) {
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
   * UpdateBackupVaultRequest updates description and/or labels for a backupVault.
   * </pre>
   *
   * Protobuf type {@code google.cloud.netapp.v1.UpdateBackupVaultRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.netapp.v1.UpdateBackupVaultRequest)
      com.google.cloud.netapp.v1.UpdateBackupVaultRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.netapp.v1.BackupVaultProto
          .internal_static_google_cloud_netapp_v1_UpdateBackupVaultRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.netapp.v1.BackupVaultProto
          .internal_static_google_cloud_netapp_v1_UpdateBackupVaultRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.netapp.v1.UpdateBackupVaultRequest.class,
              com.google.cloud.netapp.v1.UpdateBackupVaultRequest.Builder.class);
    }

    // Construct using com.google.cloud.netapp.v1.UpdateBackupVaultRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      backupVault_ = null;
      if (backupVaultBuilder_ != null) {
        backupVaultBuilder_.dispose();
        backupVaultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.netapp.v1.BackupVaultProto
          .internal_static_google_cloud_netapp_v1_UpdateBackupVaultRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.UpdateBackupVaultRequest getDefaultInstanceForType() {
      return com.google.cloud.netapp.v1.UpdateBackupVaultRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.UpdateBackupVaultRequest build() {
      com.google.cloud.netapp.v1.UpdateBackupVaultRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.UpdateBackupVaultRequest buildPartial() {
      com.google.cloud.netapp.v1.UpdateBackupVaultRequest result =
          new com.google.cloud.netapp.v1.UpdateBackupVaultRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.netapp.v1.UpdateBackupVaultRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.backupVault_ =
            backupVaultBuilder_ == null ? backupVault_ : backupVaultBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.netapp.v1.UpdateBackupVaultRequest) {
        return mergeFrom((com.google.cloud.netapp.v1.UpdateBackupVaultRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.netapp.v1.UpdateBackupVaultRequest other) {
      if (other == com.google.cloud.netapp.v1.UpdateBackupVaultRequest.getDefaultInstance())
        return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasBackupVault()) {
        mergeBackupVault(other.getBackupVault());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getBackupVaultFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Backup resource to be updated.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Backup resource to be updated.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Backup resource to be updated.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Backup resource to be updated.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Backup resource to be updated.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Backup resource to be updated.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000001);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Backup resource to be updated.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Backup resource to be updated.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Field mask is used to specify the fields to be overwritten in the
     * Backup resource to be updated.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private com.google.cloud.netapp.v1.BackupVault backupVault_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.netapp.v1.BackupVault,
            com.google.cloud.netapp.v1.BackupVault.Builder,
            com.google.cloud.netapp.v1.BackupVaultOrBuilder>
        backupVaultBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The backupVault being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the backupVault field is set.
     */
    public boolean hasBackupVault() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The backupVault being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The backupVault.
     */
    public com.google.cloud.netapp.v1.BackupVault getBackupVault() {
      if (backupVaultBuilder_ == null) {
        return backupVault_ == null
            ? com.google.cloud.netapp.v1.BackupVault.getDefaultInstance()
            : backupVault_;
      } else {
        return backupVaultBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The backupVault being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBackupVault(com.google.cloud.netapp.v1.BackupVault value) {
      if (backupVaultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        backupVault_ = value;
      } else {
        backupVaultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The backupVault being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBackupVault(com.google.cloud.netapp.v1.BackupVault.Builder builderForValue) {
      if (backupVaultBuilder_ == null) {
        backupVault_ = builderForValue.build();
      } else {
        backupVaultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The backupVault being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeBackupVault(com.google.cloud.netapp.v1.BackupVault value) {
      if (backupVaultBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && backupVault_ != null
            && backupVault_ != com.google.cloud.netapp.v1.BackupVault.getDefaultInstance()) {
          getBackupVaultBuilder().mergeFrom(value);
        } else {
          backupVault_ = value;
        }
      } else {
        backupVaultBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The backupVault being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearBackupVault() {
      bitField0_ = (bitField0_ & ~0x00000002);
      backupVault_ = null;
      if (backupVaultBuilder_ != null) {
        backupVaultBuilder_.dispose();
        backupVaultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The backupVault being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1.BackupVault.Builder getBackupVaultBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBackupVaultFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The backupVault being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.netapp.v1.BackupVaultOrBuilder getBackupVaultOrBuilder() {
      if (backupVaultBuilder_ != null) {
        return backupVaultBuilder_.getMessageOrBuilder();
      } else {
        return backupVault_ == null
            ? com.google.cloud.netapp.v1.BackupVault.getDefaultInstance()
            : backupVault_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The backupVault being updated
     * </pre>
     *
     * <code>
     * .google.cloud.netapp.v1.BackupVault backup_vault = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.netapp.v1.BackupVault,
            com.google.cloud.netapp.v1.BackupVault.Builder,
            com.google.cloud.netapp.v1.BackupVaultOrBuilder>
        getBackupVaultFieldBuilder() {
      if (backupVaultBuilder_ == null) {
        backupVaultBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.netapp.v1.BackupVault,
                com.google.cloud.netapp.v1.BackupVault.Builder,
                com.google.cloud.netapp.v1.BackupVaultOrBuilder>(
                getBackupVault(), getParentForChildren(), isClean());
        backupVault_ = null;
      }
      return backupVaultBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.netapp.v1.UpdateBackupVaultRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.netapp.v1.UpdateBackupVaultRequest)
  private static final com.google.cloud.netapp.v1.UpdateBackupVaultRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.netapp.v1.UpdateBackupVaultRequest();
  }

  public static com.google.cloud.netapp.v1.UpdateBackupVaultRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateBackupVaultRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateBackupVaultRequest>() {
        @java.lang.Override
        public UpdateBackupVaultRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UpdateBackupVaultRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateBackupVaultRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.netapp.v1.UpdateBackupVaultRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
