/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.proto;

public final class V1Networking {
  private V1Networking() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface IPBlockOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.networking.v1.IPBlock)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * CIDR is a string representing the IP Block
     * Valid examples are "192.168.1.1/24"
     * </pre>
     *
     * <code>optional string cidr = 1;</code>
     */
    boolean hasCidr();
    /**
     *
     *
     * <pre>
     * CIDR is a string representing the IP Block
     * Valid examples are "192.168.1.1/24"
     * </pre>
     *
     * <code>optional string cidr = 1;</code>
     */
    java.lang.String getCidr();
    /**
     *
     *
     * <pre>
     * CIDR is a string representing the IP Block
     * Valid examples are "192.168.1.1/24"
     * </pre>
     *
     * <code>optional string cidr = 1;</code>
     */
    com.google.protobuf.ByteString getCidrBytes();

    /**
     *
     *
     * <pre>
     * Except is a slice of CIDRs that should not be included within an IP Block
     * Valid examples are "192.168.1.1/24"
     * Except values will be rejected if they are outside the CIDR range
     * +optional
     * </pre>
     *
     * <code>repeated string except = 2;</code>
     */
    java.util.List<java.lang.String> getExceptList();
    /**
     *
     *
     * <pre>
     * Except is a slice of CIDRs that should not be included within an IP Block
     * Valid examples are "192.168.1.1/24"
     * Except values will be rejected if they are outside the CIDR range
     * +optional
     * </pre>
     *
     * <code>repeated string except = 2;</code>
     */
    int getExceptCount();
    /**
     *
     *
     * <pre>
     * Except is a slice of CIDRs that should not be included within an IP Block
     * Valid examples are "192.168.1.1/24"
     * Except values will be rejected if they are outside the CIDR range
     * +optional
     * </pre>
     *
     * <code>repeated string except = 2;</code>
     */
    java.lang.String getExcept(int index);
    /**
     *
     *
     * <pre>
     * Except is a slice of CIDRs that should not be included within an IP Block
     * Valid examples are "192.168.1.1/24"
     * Except values will be rejected if they are outside the CIDR range
     * +optional
     * </pre>
     *
     * <code>repeated string except = 2;</code>
     */
    com.google.protobuf.ByteString getExceptBytes(int index);
  }
  /**
   *
   *
   * <pre>
   * IPBlock describes a particular CIDR (Ex. "192.168.1.1/24") that is allowed to the pods
   * matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should
   * not be included within this rule.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.networking.v1.IPBlock}
   */
  public static final class IPBlock extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.networking.v1.IPBlock)
      IPBlockOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use IPBlock.newBuilder() to construct.
    private IPBlock(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private IPBlock() {
      cidr_ = "";
      except_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private IPBlock(
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
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                cidr_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  except_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000002;
                }
                except_.add(bs);
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          except_ = except_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_IPBlock_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_IPBlock_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Networking.IPBlock.class,
              io.kubernetes.client.proto.V1Networking.IPBlock.Builder.class);
    }

    private int bitField0_;
    public static final int CIDR_FIELD_NUMBER = 1;
    private volatile java.lang.Object cidr_;
    /**
     *
     *
     * <pre>
     * CIDR is a string representing the IP Block
     * Valid examples are "192.168.1.1/24"
     * </pre>
     *
     * <code>optional string cidr = 1;</code>
     */
    public boolean hasCidr() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * CIDR is a string representing the IP Block
     * Valid examples are "192.168.1.1/24"
     * </pre>
     *
     * <code>optional string cidr = 1;</code>
     */
    public java.lang.String getCidr() {
      java.lang.Object ref = cidr_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          cidr_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * CIDR is a string representing the IP Block
     * Valid examples are "192.168.1.1/24"
     * </pre>
     *
     * <code>optional string cidr = 1;</code>
     */
    public com.google.protobuf.ByteString getCidrBytes() {
      java.lang.Object ref = cidr_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        cidr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EXCEPT_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList except_;
    /**
     *
     *
     * <pre>
     * Except is a slice of CIDRs that should not be included within an IP Block
     * Valid examples are "192.168.1.1/24"
     * Except values will be rejected if they are outside the CIDR range
     * +optional
     * </pre>
     *
     * <code>repeated string except = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList getExceptList() {
      return except_;
    }
    /**
     *
     *
     * <pre>
     * Except is a slice of CIDRs that should not be included within an IP Block
     * Valid examples are "192.168.1.1/24"
     * Except values will be rejected if they are outside the CIDR range
     * +optional
     * </pre>
     *
     * <code>repeated string except = 2;</code>
     */
    public int getExceptCount() {
      return except_.size();
    }
    /**
     *
     *
     * <pre>
     * Except is a slice of CIDRs that should not be included within an IP Block
     * Valid examples are "192.168.1.1/24"
     * Except values will be rejected if they are outside the CIDR range
     * +optional
     * </pre>
     *
     * <code>repeated string except = 2;</code>
     */
    public java.lang.String getExcept(int index) {
      return except_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Except is a slice of CIDRs that should not be included within an IP Block
     * Valid examples are "192.168.1.1/24"
     * Except values will be rejected if they are outside the CIDR range
     * +optional
     * </pre>
     *
     * <code>repeated string except = 2;</code>
     */
    public com.google.protobuf.ByteString getExceptBytes(int index) {
      return except_.getByteString(index);
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cidr_);
      }
      for (int i = 0; i < except_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, except_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cidr_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < except_.size(); i++) {
          dataSize += computeStringSizeNoTag(except_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getExceptList().size();
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Networking.IPBlock)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Networking.IPBlock other =
          (io.kubernetes.client.proto.V1Networking.IPBlock) obj;

      boolean result = true;
      result = result && (hasCidr() == other.hasCidr());
      if (hasCidr()) {
        result = result && getCidr().equals(other.getCidr());
      }
      result = result && getExceptList().equals(other.getExceptList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasCidr()) {
        hash = (37 * hash) + CIDR_FIELD_NUMBER;
        hash = (53 * hash) + getCidr().hashCode();
      }
      if (getExceptCount() > 0) {
        hash = (37 * hash) + EXCEPT_FIELD_NUMBER;
        hash = (53 * hash) + getExceptList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Networking.IPBlock parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.IPBlock parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.IPBlock parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.IPBlock parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.IPBlock parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.IPBlock parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.IPBlock parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.IPBlock parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.IPBlock parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.IPBlock parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.IPBlock parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.IPBlock parseFrom(
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

    public static Builder newBuilder(io.kubernetes.client.proto.V1Networking.IPBlock prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * IPBlock describes a particular CIDR (Ex. "192.168.1.1/24") that is allowed to the pods
     * matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should
     * not be included within this rule.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.networking.v1.IPBlock}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.networking.v1.IPBlock)
        io.kubernetes.client.proto.V1Networking.IPBlockOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_IPBlock_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_IPBlock_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Networking.IPBlock.class,
                io.kubernetes.client.proto.V1Networking.IPBlock.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Networking.IPBlock.newBuilder()
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
        cidr_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        except_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_IPBlock_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.IPBlock getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Networking.IPBlock.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.IPBlock build() {
        io.kubernetes.client.proto.V1Networking.IPBlock result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.IPBlock buildPartial() {
        io.kubernetes.client.proto.V1Networking.IPBlock result =
            new io.kubernetes.client.proto.V1Networking.IPBlock(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.cidr_ = cidr_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          except_ = except_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.except_ = except_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Networking.IPBlock) {
          return mergeFrom((io.kubernetes.client.proto.V1Networking.IPBlock) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Networking.IPBlock other) {
        if (other == io.kubernetes.client.proto.V1Networking.IPBlock.getDefaultInstance())
          return this;
        if (other.hasCidr()) {
          bitField0_ |= 0x00000001;
          cidr_ = other.cidr_;
          onChanged();
        }
        if (!other.except_.isEmpty()) {
          if (except_.isEmpty()) {
            except_ = other.except_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureExceptIsMutable();
            except_.addAll(other.except_);
          }
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
        io.kubernetes.client.proto.V1Networking.IPBlock parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Networking.IPBlock) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object cidr_ = "";
      /**
       *
       *
       * <pre>
       * CIDR is a string representing the IP Block
       * Valid examples are "192.168.1.1/24"
       * </pre>
       *
       * <code>optional string cidr = 1;</code>
       */
      public boolean hasCidr() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * CIDR is a string representing the IP Block
       * Valid examples are "192.168.1.1/24"
       * </pre>
       *
       * <code>optional string cidr = 1;</code>
       */
      public java.lang.String getCidr() {
        java.lang.Object ref = cidr_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            cidr_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * CIDR is a string representing the IP Block
       * Valid examples are "192.168.1.1/24"
       * </pre>
       *
       * <code>optional string cidr = 1;</code>
       */
      public com.google.protobuf.ByteString getCidrBytes() {
        java.lang.Object ref = cidr_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          cidr_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * CIDR is a string representing the IP Block
       * Valid examples are "192.168.1.1/24"
       * </pre>
       *
       * <code>optional string cidr = 1;</code>
       */
      public Builder setCidr(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        cidr_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * CIDR is a string representing the IP Block
       * Valid examples are "192.168.1.1/24"
       * </pre>
       *
       * <code>optional string cidr = 1;</code>
       */
      public Builder clearCidr() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cidr_ = getDefaultInstance().getCidr();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * CIDR is a string representing the IP Block
       * Valid examples are "192.168.1.1/24"
       * </pre>
       *
       * <code>optional string cidr = 1;</code>
       */
      public Builder setCidrBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        cidr_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList except_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureExceptIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          except_ = new com.google.protobuf.LazyStringArrayList(except_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       *
       *
       * <pre>
       * Except is a slice of CIDRs that should not be included within an IP Block
       * Valid examples are "192.168.1.1/24"
       * Except values will be rejected if they are outside the CIDR range
       * +optional
       * </pre>
       *
       * <code>repeated string except = 2;</code>
       */
      public com.google.protobuf.ProtocolStringList getExceptList() {
        return except_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * Except is a slice of CIDRs that should not be included within an IP Block
       * Valid examples are "192.168.1.1/24"
       * Except values will be rejected if they are outside the CIDR range
       * +optional
       * </pre>
       *
       * <code>repeated string except = 2;</code>
       */
      public int getExceptCount() {
        return except_.size();
      }
      /**
       *
       *
       * <pre>
       * Except is a slice of CIDRs that should not be included within an IP Block
       * Valid examples are "192.168.1.1/24"
       * Except values will be rejected if they are outside the CIDR range
       * +optional
       * </pre>
       *
       * <code>repeated string except = 2;</code>
       */
      public java.lang.String getExcept(int index) {
        return except_.get(index);
      }
      /**
       *
       *
       * <pre>
       * Except is a slice of CIDRs that should not be included within an IP Block
       * Valid examples are "192.168.1.1/24"
       * Except values will be rejected if they are outside the CIDR range
       * +optional
       * </pre>
       *
       * <code>repeated string except = 2;</code>
       */
      public com.google.protobuf.ByteString getExceptBytes(int index) {
        return except_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * Except is a slice of CIDRs that should not be included within an IP Block
       * Valid examples are "192.168.1.1/24"
       * Except values will be rejected if they are outside the CIDR range
       * +optional
       * </pre>
       *
       * <code>repeated string except = 2;</code>
       */
      public Builder setExcept(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExceptIsMutable();
        except_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Except is a slice of CIDRs that should not be included within an IP Block
       * Valid examples are "192.168.1.1/24"
       * Except values will be rejected if they are outside the CIDR range
       * +optional
       * </pre>
       *
       * <code>repeated string except = 2;</code>
       */
      public Builder addExcept(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExceptIsMutable();
        except_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Except is a slice of CIDRs that should not be included within an IP Block
       * Valid examples are "192.168.1.1/24"
       * Except values will be rejected if they are outside the CIDR range
       * +optional
       * </pre>
       *
       * <code>repeated string except = 2;</code>
       */
      public Builder addAllExcept(java.lang.Iterable<java.lang.String> values) {
        ensureExceptIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, except_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Except is a slice of CIDRs that should not be included within an IP Block
       * Valid examples are "192.168.1.1/24"
       * Except values will be rejected if they are outside the CIDR range
       * +optional
       * </pre>
       *
       * <code>repeated string except = 2;</code>
       */
      public Builder clearExcept() {
        except_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Except is a slice of CIDRs that should not be included within an IP Block
       * Valid examples are "192.168.1.1/24"
       * Except values will be rejected if they are outside the CIDR range
       * +optional
       * </pre>
       *
       * <code>repeated string except = 2;</code>
       */
      public Builder addExceptBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExceptIsMutable();
        except_.add(value);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.networking.v1.IPBlock)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.networking.v1.IPBlock)
    private static final io.kubernetes.client.proto.V1Networking.IPBlock DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Networking.IPBlock();
    }

    public static io.kubernetes.client.proto.V1Networking.IPBlock getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<IPBlock> PARSER =
        new com.google.protobuf.AbstractParser<IPBlock>() {
          @java.lang.Override
          public IPBlock parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new IPBlock(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<IPBlock> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IPBlock> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Networking.IPBlock getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface NetworkPolicyOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.networking.v1.NetworkPolicy)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Specification of the desired behavior for this NetworkPolicy.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.networking.v1.NetworkPolicySpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior for this NetworkPolicy.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.networking.v1.NetworkPolicySpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicySpec getSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior for this NetworkPolicy.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.networking.v1.NetworkPolicySpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicySpecOrBuilder getSpecOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * NetworkPolicy describes what network traffic is allowed for a set of Pods
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.networking.v1.NetworkPolicy}
   */
  public static final class NetworkPolicy extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.networking.v1.NetworkPolicy)
      NetworkPolicyOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use NetworkPolicy.newBuilder() to construct.
    private NetworkPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private NetworkPolicy() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private NetworkPolicy(
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
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
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
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_NetworkPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_NetworkPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Networking.NetworkPolicy.class,
              io.kubernetes.client.proto.V1Networking.NetworkPolicy.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1Networking.NetworkPolicySpec spec_;
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior for this NetworkPolicy.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.networking.v1.NetworkPolicySpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior for this NetworkPolicy.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.networking.v1.NetworkPolicySpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicySpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired behavior for this NetworkPolicy.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.networking.v1.NetworkPolicySpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicySpecOrBuilder getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.getDefaultInstance()
          : spec_;
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSpec());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Networking.NetworkPolicy)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Networking.NetworkPolicy other =
          (io.kubernetes.client.proto.V1Networking.NetworkPolicy) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasSpec()) {
        hash = (37 * hash) + SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getSpec().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicy parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicy parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicy parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicy parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicy parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicy parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicy parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicy parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicy parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicy parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicy parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicy parseFrom(
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
        io.kubernetes.client.proto.V1Networking.NetworkPolicy prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * NetworkPolicy describes what network traffic is allowed for a set of Pods
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.networking.v1.NetworkPolicy}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.networking.v1.NetworkPolicy)
        io.kubernetes.client.proto.V1Networking.NetworkPolicyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicy_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicy_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Networking.NetworkPolicy.class,
                io.kubernetes.client.proto.V1Networking.NetworkPolicy.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Networking.NetworkPolicy.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSpecFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicy_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicy getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Networking.NetworkPolicy.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicy build() {
        io.kubernetes.client.proto.V1Networking.NetworkPolicy result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicy buildPartial() {
        io.kubernetes.client.proto.V1Networking.NetworkPolicy result =
            new io.kubernetes.client.proto.V1Networking.NetworkPolicy(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Networking.NetworkPolicy) {
          return mergeFrom((io.kubernetes.client.proto.V1Networking.NetworkPolicy) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Networking.NetworkPolicy other) {
        if (other == io.kubernetes.client.proto.V1Networking.NetworkPolicy.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
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
        io.kubernetes.client.proto.V1Networking.NetworkPolicy parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Networking.NetworkPolicy) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.V1Networking.NetworkPolicySpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicySpec,
              io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicySpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior for this NetworkPolicy.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.NetworkPolicySpec spec = 2;</code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior for this NetworkPolicy.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.NetworkPolicySpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicySpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior for this NetworkPolicy.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.NetworkPolicySpec spec = 2;</code>
       */
      public Builder setSpec(io.kubernetes.client.proto.V1Networking.NetworkPolicySpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior for this NetworkPolicy.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.NetworkPolicySpec spec = 2;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.Builder builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior for this NetworkPolicy.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.NetworkPolicySpec spec = 2;</code>
       */
      public Builder mergeSpec(io.kubernetes.client.proto.V1Networking.NetworkPolicySpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1Networking.NetworkPolicySpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.newBuilder(spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior for this NetworkPolicy.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.NetworkPolicySpec spec = 2;</code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior for this NetworkPolicy.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.NetworkPolicySpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.Builder getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior for this NetworkPolicy.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.NetworkPolicySpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicySpecOrBuilder getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired behavior for this NetworkPolicy.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.NetworkPolicySpec spec = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicySpec,
              io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicySpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Networking.NetworkPolicySpec,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.Builder,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicySpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.networking.v1.NetworkPolicy)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.networking.v1.NetworkPolicy)
    private static final io.kubernetes.client.proto.V1Networking.NetworkPolicy DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Networking.NetworkPolicy();
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicy getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<NetworkPolicy> PARSER =
        new com.google.protobuf.AbstractParser<NetworkPolicy>() {
          @java.lang.Override
          public NetworkPolicy parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new NetworkPolicy(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<NetworkPolicy> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NetworkPolicy> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Networking.NetworkPolicy getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface NetworkPolicyEgressRuleOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.networking.v1.NetworkPolicyEgressRule)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * List of destination ports for outgoing traffic.
     * Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPort> getPortsList();
    /**
     *
     *
     * <pre>
     * List of destination ports for outgoing traffic.
     * Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicyPort getPorts(int index);
    /**
     *
     *
     * <pre>
     * List of destination ports for outgoing traffic.
     * Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    int getPortsCount();
    /**
     *
     *
     * <pre>
     * List of destination ports for outgoing traffic.
     * Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder>
        getPortsOrBuilderList();
    /**
     *
     *
     * <pre>
     * List of destination ports for outgoing traffic.
     * Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder getPortsOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * List of destinations for outgoing traffic of pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all destinations (traffic not restricted by
     * destination). If this field is present and contains at least one item, this rule
     * allows traffic only if the traffic matches at least one item in the to list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer> getToList();
    /**
     *
     *
     * <pre>
     * List of destinations for outgoing traffic of pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all destinations (traffic not restricted by
     * destination). If this field is present and contains at least one item, this rule
     * allows traffic only if the traffic matches at least one item in the to list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer getTo(int index);
    /**
     *
     *
     * <pre>
     * List of destinations for outgoing traffic of pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all destinations (traffic not restricted by
     * destination). If this field is present and contains at least one item, this rule
     * allows traffic only if the traffic matches at least one item in the to list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
     */
    int getToCount();
    /**
     *
     *
     * <pre>
     * List of destinations for outgoing traffic of pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all destinations (traffic not restricted by
     * destination). If this field is present and contains at least one item, this rule
     * allows traffic only if the traffic matches at least one item in the to list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder>
        getToOrBuilderList();
    /**
     *
     *
     * <pre>
     * List of destinations for outgoing traffic of pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all destinations (traffic not restricted by
     * destination). If this field is present and contains at least one item, this rule
     * allows traffic only if the traffic matches at least one item in the to list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder getToOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods
   * matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and to.
   * This type is beta-level in 1.8
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.networking.v1.NetworkPolicyEgressRule}
   */
  public static final class NetworkPolicyEgressRule extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.networking.v1.NetworkPolicyEgressRule)
      NetworkPolicyEgressRuleOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use NetworkPolicyEgressRule.newBuilder() to construct.
    private NetworkPolicyEgressRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private NetworkPolicyEgressRule() {
      ports_ = java.util.Collections.emptyList();
      to_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private NetworkPolicyEgressRule(
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
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  ports_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1Networking.NetworkPolicyPort>();
                  mutable_bitField0_ |= 0x00000001;
                }
                ports_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.PARSER,
                        extensionRegistry));
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  to_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer>();
                  mutable_bitField0_ |= 0x00000002;
                }
                to_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.PARSER,
                        extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          ports_ = java.util.Collections.unmodifiableList(ports_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          to_ = java.util.Collections.unmodifiableList(to_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_NetworkPolicyEgressRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_NetworkPolicyEgressRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.class,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.Builder.class);
    }

    public static final int PORTS_FIELD_NUMBER = 1;
    private java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPort> ports_;
    /**
     *
     *
     * <pre>
     * List of destination ports for outgoing traffic.
     * Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPort>
        getPortsList() {
      return ports_;
    }
    /**
     *
     *
     * <pre>
     * List of destination ports for outgoing traffic.
     * Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder>
        getPortsOrBuilderList() {
      return ports_;
    }
    /**
     *
     *
     * <pre>
     * List of destination ports for outgoing traffic.
     * Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    public int getPortsCount() {
      return ports_.size();
    }
    /**
     *
     *
     * <pre>
     * List of destination ports for outgoing traffic.
     * Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyPort getPorts(int index) {
      return ports_.get(index);
    }
    /**
     *
     *
     * <pre>
     * List of destination ports for outgoing traffic.
     * Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder getPortsOrBuilder(
        int index) {
      return ports_.get(index);
    }

    public static final int TO_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer> to_;
    /**
     *
     *
     * <pre>
     * List of destinations for outgoing traffic of pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all destinations (traffic not restricted by
     * destination). If this field is present and contains at least one item, this rule
     * allows traffic only if the traffic matches at least one item in the to list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer> getToList() {
      return to_;
    }
    /**
     *
     *
     * <pre>
     * List of destinations for outgoing traffic of pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all destinations (traffic not restricted by
     * destination). If this field is present and contains at least one item, this rule
     * allows traffic only if the traffic matches at least one item in the to list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder>
        getToOrBuilderList() {
      return to_;
    }
    /**
     *
     *
     * <pre>
     * List of destinations for outgoing traffic of pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all destinations (traffic not restricted by
     * destination). If this field is present and contains at least one item, this rule
     * allows traffic only if the traffic matches at least one item in the to list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
     */
    public int getToCount() {
      return to_.size();
    }
    /**
     *
     *
     * <pre>
     * List of destinations for outgoing traffic of pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all destinations (traffic not restricted by
     * destination). If this field is present and contains at least one item, this rule
     * allows traffic only if the traffic matches at least one item in the to list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer getTo(int index) {
      return to_.get(index);
    }
    /**
     *
     *
     * <pre>
     * List of destinations for outgoing traffic of pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all destinations (traffic not restricted by
     * destination). If this field is present and contains at least one item, this rule
     * allows traffic only if the traffic matches at least one item in the to list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder getToOrBuilder(
        int index) {
      return to_.get(index);
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
      for (int i = 0; i < ports_.size(); i++) {
        output.writeMessage(1, ports_.get(i));
      }
      for (int i = 0; i < to_.size(); i++) {
        output.writeMessage(2, to_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < ports_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, ports_.get(i));
      }
      for (int i = 0; i < to_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, to_.get(i));
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule other =
          (io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule) obj;

      boolean result = true;
      result = result && getPortsList().equals(other.getPortsList());
      result = result && getToList().equals(other.getToList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getPortsCount() > 0) {
        hash = (37 * hash) + PORTS_FIELD_NUMBER;
        hash = (53 * hash) + getPortsList().hashCode();
      }
      if (getToCount() > 0) {
        hash = (37 * hash) + TO_FIELD_NUMBER;
        hash = (53 * hash) + getToList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule parseFrom(
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
        io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods
     * matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and to.
     * This type is beta-level in 1.8
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.networking.v1.NetworkPolicyEgressRule}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.networking.v1.NetworkPolicyEgressRule)
        io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRuleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicyEgressRule_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicyEgressRule_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.class,
                io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getPortsFieldBuilder();
          getToFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (portsBuilder_ == null) {
          ports_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          portsBuilder_.clear();
        }
        if (toBuilder_ == null) {
          to_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          toBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicyEgressRule_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule build() {
        io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule buildPartial() {
        io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule result =
            new io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule(this);
        int from_bitField0_ = bitField0_;
        if (portsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            ports_ = java.util.Collections.unmodifiableList(ports_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.ports_ = ports_;
        } else {
          result.ports_ = portsBuilder_.build();
        }
        if (toBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            to_ = java.util.Collections.unmodifiableList(to_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.to_ = to_;
        } else {
          result.to_ = toBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule) {
          return mergeFrom((io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule other) {
        if (other
            == io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.getDefaultInstance())
          return this;
        if (portsBuilder_ == null) {
          if (!other.ports_.isEmpty()) {
            if (ports_.isEmpty()) {
              ports_ = other.ports_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePortsIsMutable();
              ports_.addAll(other.ports_);
            }
            onChanged();
          }
        } else {
          if (!other.ports_.isEmpty()) {
            if (portsBuilder_.isEmpty()) {
              portsBuilder_.dispose();
              portsBuilder_ = null;
              ports_ = other.ports_;
              bitField0_ = (bitField0_ & ~0x00000001);
              portsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getPortsFieldBuilder()
                      : null;
            } else {
              portsBuilder_.addAllMessages(other.ports_);
            }
          }
        }
        if (toBuilder_ == null) {
          if (!other.to_.isEmpty()) {
            if (to_.isEmpty()) {
              to_ = other.to_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureToIsMutable();
              to_.addAll(other.to_);
            }
            onChanged();
          }
        } else {
          if (!other.to_.isEmpty()) {
            if (toBuilder_.isEmpty()) {
              toBuilder_.dispose();
              toBuilder_ = null;
              to_ = other.to_;
              bitField0_ = (bitField0_ & ~0x00000002);
              toBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getToFieldBuilder()
                      : null;
            } else {
              toBuilder_.addAllMessages(other.to_);
            }
          }
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
        io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule)
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

      private java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPort> ports_ =
          java.util.Collections.emptyList();

      private void ensurePortsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          ports_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1Networking.NetworkPolicyPort>(
                  ports_);
          bitField0_ |= 0x00000001;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPort,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder>
          portsBuilder_;

      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPort>
          getPortsList() {
        if (portsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(ports_);
        } else {
          return portsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public int getPortsCount() {
        if (portsBuilder_ == null) {
          return ports_.size();
        } else {
          return portsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPort getPorts(int index) {
        if (portsBuilder_ == null) {
          return ports_.get(index);
        } else {
          return portsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder setPorts(
          int index, io.kubernetes.client.proto.V1Networking.NetworkPolicyPort value) {
        if (portsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePortsIsMutable();
          ports_.set(index, value);
          onChanged();
        } else {
          portsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder setPorts(
          int index,
          io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder builderForValue) {
        if (portsBuilder_ == null) {
          ensurePortsIsMutable();
          ports_.set(index, builderForValue.build());
          onChanged();
        } else {
          portsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder addPorts(io.kubernetes.client.proto.V1Networking.NetworkPolicyPort value) {
        if (portsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePortsIsMutable();
          ports_.add(value);
          onChanged();
        } else {
          portsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder addPorts(
          int index, io.kubernetes.client.proto.V1Networking.NetworkPolicyPort value) {
        if (portsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePortsIsMutable();
          ports_.add(index, value);
          onChanged();
        } else {
          portsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder addPorts(
          io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder builderForValue) {
        if (portsBuilder_ == null) {
          ensurePortsIsMutable();
          ports_.add(builderForValue.build());
          onChanged();
        } else {
          portsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder addPorts(
          int index,
          io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder builderForValue) {
        if (portsBuilder_ == null) {
          ensurePortsIsMutable();
          ports_.add(index, builderForValue.build());
          onChanged();
        } else {
          portsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder addAllPorts(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPort>
              values) {
        if (portsBuilder_ == null) {
          ensurePortsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, ports_);
          onChanged();
        } else {
          portsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder clearPorts() {
        if (portsBuilder_ == null) {
          ports_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          portsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder removePorts(int index) {
        if (portsBuilder_ == null) {
          ensurePortsIsMutable();
          ports_.remove(index);
          onChanged();
        } else {
          portsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder getPortsBuilder(
          int index) {
        return getPortsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder getPortsOrBuilder(
          int index) {
        if (portsBuilder_ == null) {
          return ports_.get(index);
        } else {
          return portsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder>
          getPortsOrBuilderList() {
        if (portsBuilder_ != null) {
          return portsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(ports_);
        }
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder addPortsBuilder() {
        return getPortsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder addPortsBuilder(
          int index) {
        return getPortsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of destination ports for outgoing traffic.
       * Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder>
          getPortsBuilderList() {
        return getPortsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPort,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder>
          getPortsFieldBuilder() {
        if (portsBuilder_ == null) {
          portsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyPort,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder>(
                  ports_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          ports_ = null;
        }
        return portsBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer> to_ =
          java.util.Collections.emptyList();

      private void ensureToIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          to_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer>(
                  to_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder>
          toBuilder_;

      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer> getToList() {
        if (toBuilder_ == null) {
          return java.util.Collections.unmodifiableList(to_);
        } else {
          return toBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public int getToCount() {
        if (toBuilder_ == null) {
          return to_.size();
        } else {
          return toBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer getTo(int index) {
        if (toBuilder_ == null) {
          return to_.get(index);
        } else {
          return toBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public Builder setTo(
          int index, io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer value) {
        if (toBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureToIsMutable();
          to_.set(index, value);
          onChanged();
        } else {
          toBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public Builder setTo(
          int index,
          io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder builderForValue) {
        if (toBuilder_ == null) {
          ensureToIsMutable();
          to_.set(index, builderForValue.build());
          onChanged();
        } else {
          toBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public Builder addTo(io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer value) {
        if (toBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureToIsMutable();
          to_.add(value);
          onChanged();
        } else {
          toBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public Builder addTo(
          int index, io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer value) {
        if (toBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureToIsMutable();
          to_.add(index, value);
          onChanged();
        } else {
          toBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public Builder addTo(
          io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder builderForValue) {
        if (toBuilder_ == null) {
          ensureToIsMutable();
          to_.add(builderForValue.build());
          onChanged();
        } else {
          toBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public Builder addTo(
          int index,
          io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder builderForValue) {
        if (toBuilder_ == null) {
          ensureToIsMutable();
          to_.add(index, builderForValue.build());
          onChanged();
        } else {
          toBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public Builder addAllTo(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer>
              values) {
        if (toBuilder_ == null) {
          ensureToIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, to_);
          onChanged();
        } else {
          toBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public Builder clearTo() {
        if (toBuilder_ == null) {
          to_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          toBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public Builder removeTo(int index) {
        if (toBuilder_ == null) {
          ensureToIsMutable();
          to_.remove(index);
          onChanged();
        } else {
          toBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder getToBuilder(
          int index) {
        return getToFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder getToOrBuilder(
          int index) {
        if (toBuilder_ == null) {
          return to_.get(index);
        } else {
          return toBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder>
          getToOrBuilderList() {
        if (toBuilder_ != null) {
          return toBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(to_);
        }
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder addToBuilder() {
        return getToFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder addToBuilder(
          int index) {
        return getToFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of destinations for outgoing traffic of pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all destinations (traffic not restricted by
       * destination). If this field is present and contains at least one item, this rule
       * allows traffic only if the traffic matches at least one item in the to list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer to = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder>
          getToBuilderList() {
        return getToFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder>
          getToFieldBuilder() {
        if (toBuilder_ == null) {
          toBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder>(
                  to_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          to_ = null;
        }
        return toBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.networking.v1.NetworkPolicyEgressRule)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.networking.v1.NetworkPolicyEgressRule)
    private static final io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule();
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<NetworkPolicyEgressRule> PARSER =
        new com.google.protobuf.AbstractParser<NetworkPolicyEgressRule>() {
          @java.lang.Override
          public NetworkPolicyEgressRule parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new NetworkPolicyEgressRule(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<NetworkPolicyEgressRule> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NetworkPolicyEgressRule> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface NetworkPolicyIngressRuleOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.networking.v1.NetworkPolicyIngressRule)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * List of ports which should be made accessible on the pods selected for this
     * rule. Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPort> getPortsList();
    /**
     *
     *
     * <pre>
     * List of ports which should be made accessible on the pods selected for this
     * rule. Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicyPort getPorts(int index);
    /**
     *
     *
     * <pre>
     * List of ports which should be made accessible on the pods selected for this
     * rule. Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    int getPortsCount();
    /**
     *
     *
     * <pre>
     * List of ports which should be made accessible on the pods selected for this
     * rule. Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder>
        getPortsOrBuilderList();
    /**
     *
     *
     * <pre>
     * List of ports which should be made accessible on the pods selected for this
     * rule. Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder getPortsOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * List of sources which should be able to access the pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all sources (traffic not restricted by
     * source). If this field is present and contains at least on item, this rule
     * allows traffic only if the traffic matches at least one item in the from list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer> getFromList();
    /**
     *
     *
     * <pre>
     * List of sources which should be able to access the pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all sources (traffic not restricted by
     * source). If this field is present and contains at least on item, this rule
     * allows traffic only if the traffic matches at least one item in the from list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer getFrom(int index);
    /**
     *
     *
     * <pre>
     * List of sources which should be able to access the pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all sources (traffic not restricted by
     * source). If this field is present and contains at least on item, this rule
     * allows traffic only if the traffic matches at least one item in the from list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
     */
    int getFromCount();
    /**
     *
     *
     * <pre>
     * List of sources which should be able to access the pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all sources (traffic not restricted by
     * source). If this field is present and contains at least on item, this rule
     * allows traffic only if the traffic matches at least one item in the from list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder>
        getFromOrBuilderList();
    /**
     *
     *
     * <pre>
     * List of sources which should be able to access the pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all sources (traffic not restricted by
     * source). If this field is present and contains at least on item, this rule
     * allows traffic only if the traffic matches at least one item in the from list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder getFromOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods
   * matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and from.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.networking.v1.NetworkPolicyIngressRule}
   */
  public static final class NetworkPolicyIngressRule extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.networking.v1.NetworkPolicyIngressRule)
      NetworkPolicyIngressRuleOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use NetworkPolicyIngressRule.newBuilder() to construct.
    private NetworkPolicyIngressRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private NetworkPolicyIngressRule() {
      ports_ = java.util.Collections.emptyList();
      from_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private NetworkPolicyIngressRule(
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
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  ports_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1Networking.NetworkPolicyPort>();
                  mutable_bitField0_ |= 0x00000001;
                }
                ports_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.PARSER,
                        extensionRegistry));
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  from_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer>();
                  mutable_bitField0_ |= 0x00000002;
                }
                from_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.PARSER,
                        extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          ports_ = java.util.Collections.unmodifiableList(ports_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          from_ = java.util.Collections.unmodifiableList(from_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_NetworkPolicyIngressRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_NetworkPolicyIngressRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.class,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.Builder.class);
    }

    public static final int PORTS_FIELD_NUMBER = 1;
    private java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPort> ports_;
    /**
     *
     *
     * <pre>
     * List of ports which should be made accessible on the pods selected for this
     * rule. Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPort>
        getPortsList() {
      return ports_;
    }
    /**
     *
     *
     * <pre>
     * List of ports which should be made accessible on the pods selected for this
     * rule. Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder>
        getPortsOrBuilderList() {
      return ports_;
    }
    /**
     *
     *
     * <pre>
     * List of ports which should be made accessible on the pods selected for this
     * rule. Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    public int getPortsCount() {
      return ports_.size();
    }
    /**
     *
     *
     * <pre>
     * List of ports which should be made accessible on the pods selected for this
     * rule. Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyPort getPorts(int index) {
      return ports_.get(index);
    }
    /**
     *
     *
     * <pre>
     * List of ports which should be made accessible on the pods selected for this
     * rule. Each item in this list is combined using a logical OR. If this field is
     * empty or missing, this rule matches all ports (traffic not restricted by port).
     * If this field is present and contains at least one item, then this rule allows
     * traffic only if the traffic matches at least one port in the list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder getPortsOrBuilder(
        int index) {
      return ports_.get(index);
    }

    public static final int FROM_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer> from_;
    /**
     *
     *
     * <pre>
     * List of sources which should be able to access the pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all sources (traffic not restricted by
     * source). If this field is present and contains at least on item, this rule
     * allows traffic only if the traffic matches at least one item in the from list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer> getFromList() {
      return from_;
    }
    /**
     *
     *
     * <pre>
     * List of sources which should be able to access the pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all sources (traffic not restricted by
     * source). If this field is present and contains at least on item, this rule
     * allows traffic only if the traffic matches at least one item in the from list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder>
        getFromOrBuilderList() {
      return from_;
    }
    /**
     *
     *
     * <pre>
     * List of sources which should be able to access the pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all sources (traffic not restricted by
     * source). If this field is present and contains at least on item, this rule
     * allows traffic only if the traffic matches at least one item in the from list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
     */
    public int getFromCount() {
      return from_.size();
    }
    /**
     *
     *
     * <pre>
     * List of sources which should be able to access the pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all sources (traffic not restricted by
     * source). If this field is present and contains at least on item, this rule
     * allows traffic only if the traffic matches at least one item in the from list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer getFrom(int index) {
      return from_.get(index);
    }
    /**
     *
     *
     * <pre>
     * List of sources which should be able to access the pods selected for this rule.
     * Items in this list are combined using a logical OR operation. If this field is
     * empty or missing, this rule matches all sources (traffic not restricted by
     * source). If this field is present and contains at least on item, this rule
     * allows traffic only if the traffic matches at least one item in the from list.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder getFromOrBuilder(
        int index) {
      return from_.get(index);
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
      for (int i = 0; i < ports_.size(); i++) {
        output.writeMessage(1, ports_.get(i));
      }
      for (int i = 0; i < from_.size(); i++) {
        output.writeMessage(2, from_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < ports_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, ports_.get(i));
      }
      for (int i = 0; i < from_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, from_.get(i));
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule other =
          (io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule) obj;

      boolean result = true;
      result = result && getPortsList().equals(other.getPortsList());
      result = result && getFromList().equals(other.getFromList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getPortsCount() > 0) {
        hash = (37 * hash) + PORTS_FIELD_NUMBER;
        hash = (53 * hash) + getPortsList().hashCode();
      }
      if (getFromCount() > 0) {
        hash = (37 * hash) + FROM_FIELD_NUMBER;
        hash = (53 * hash) + getFromList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule parseFrom(
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
        io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * NetworkPolicyIngressRule describes a particular set of traffic that is allowed to the pods
     * matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and from.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.networking.v1.NetworkPolicyIngressRule}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.networking.v1.NetworkPolicyIngressRule)
        io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRuleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicyIngressRule_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicyIngressRule_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.class,
                io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getPortsFieldBuilder();
          getFromFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (portsBuilder_ == null) {
          ports_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          portsBuilder_.clear();
        }
        if (fromBuilder_ == null) {
          from_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          fromBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicyIngressRule_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule build() {
        io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule buildPartial() {
        io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule result =
            new io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule(this);
        int from_bitField0_ = bitField0_;
        if (portsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            ports_ = java.util.Collections.unmodifiableList(ports_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.ports_ = ports_;
        } else {
          result.ports_ = portsBuilder_.build();
        }
        if (fromBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            from_ = java.util.Collections.unmodifiableList(from_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.from_ = from_;
        } else {
          result.from_ = fromBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule) {
          return mergeFrom(
              (io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule other) {
        if (other
            == io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule
                .getDefaultInstance()) return this;
        if (portsBuilder_ == null) {
          if (!other.ports_.isEmpty()) {
            if (ports_.isEmpty()) {
              ports_ = other.ports_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePortsIsMutable();
              ports_.addAll(other.ports_);
            }
            onChanged();
          }
        } else {
          if (!other.ports_.isEmpty()) {
            if (portsBuilder_.isEmpty()) {
              portsBuilder_.dispose();
              portsBuilder_ = null;
              ports_ = other.ports_;
              bitField0_ = (bitField0_ & ~0x00000001);
              portsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getPortsFieldBuilder()
                      : null;
            } else {
              portsBuilder_.addAllMessages(other.ports_);
            }
          }
        }
        if (fromBuilder_ == null) {
          if (!other.from_.isEmpty()) {
            if (from_.isEmpty()) {
              from_ = other.from_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureFromIsMutable();
              from_.addAll(other.from_);
            }
            onChanged();
          }
        } else {
          if (!other.from_.isEmpty()) {
            if (fromBuilder_.isEmpty()) {
              fromBuilder_.dispose();
              fromBuilder_ = null;
              from_ = other.from_;
              bitField0_ = (bitField0_ & ~0x00000002);
              fromBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getFromFieldBuilder()
                      : null;
            } else {
              fromBuilder_.addAllMessages(other.from_);
            }
          }
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
        io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule)
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

      private java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPort> ports_ =
          java.util.Collections.emptyList();

      private void ensurePortsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          ports_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1Networking.NetworkPolicyPort>(
                  ports_);
          bitField0_ |= 0x00000001;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPort,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder>
          portsBuilder_;

      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPort>
          getPortsList() {
        if (portsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(ports_);
        } else {
          return portsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public int getPortsCount() {
        if (portsBuilder_ == null) {
          return ports_.size();
        } else {
          return portsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPort getPorts(int index) {
        if (portsBuilder_ == null) {
          return ports_.get(index);
        } else {
          return portsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder setPorts(
          int index, io.kubernetes.client.proto.V1Networking.NetworkPolicyPort value) {
        if (portsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePortsIsMutable();
          ports_.set(index, value);
          onChanged();
        } else {
          portsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder setPorts(
          int index,
          io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder builderForValue) {
        if (portsBuilder_ == null) {
          ensurePortsIsMutable();
          ports_.set(index, builderForValue.build());
          onChanged();
        } else {
          portsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder addPorts(io.kubernetes.client.proto.V1Networking.NetworkPolicyPort value) {
        if (portsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePortsIsMutable();
          ports_.add(value);
          onChanged();
        } else {
          portsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder addPorts(
          int index, io.kubernetes.client.proto.V1Networking.NetworkPolicyPort value) {
        if (portsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePortsIsMutable();
          ports_.add(index, value);
          onChanged();
        } else {
          portsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder addPorts(
          io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder builderForValue) {
        if (portsBuilder_ == null) {
          ensurePortsIsMutable();
          ports_.add(builderForValue.build());
          onChanged();
        } else {
          portsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder addPorts(
          int index,
          io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder builderForValue) {
        if (portsBuilder_ == null) {
          ensurePortsIsMutable();
          ports_.add(index, builderForValue.build());
          onChanged();
        } else {
          portsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder addAllPorts(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPort>
              values) {
        if (portsBuilder_ == null) {
          ensurePortsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, ports_);
          onChanged();
        } else {
          portsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder clearPorts() {
        if (portsBuilder_ == null) {
          ports_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          portsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public Builder removePorts(int index) {
        if (portsBuilder_ == null) {
          ensurePortsIsMutable();
          ports_.remove(index);
          onChanged();
        } else {
          portsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder getPortsBuilder(
          int index) {
        return getPortsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder getPortsOrBuilder(
          int index) {
        if (portsBuilder_ == null) {
          return ports_.get(index);
        } else {
          return portsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder>
          getPortsOrBuilderList() {
        if (portsBuilder_ != null) {
          return portsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(ports_);
        }
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder addPortsBuilder() {
        return getPortsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder addPortsBuilder(
          int index) {
        return getPortsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of ports which should be made accessible on the pods selected for this
       * rule. Each item in this list is combined using a logical OR. If this field is
       * empty or missing, this rule matches all ports (traffic not restricted by port).
       * If this field is present and contains at least one item, then this rule allows
       * traffic only if the traffic matches at least one port in the list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPort ports = 1;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder>
          getPortsBuilderList() {
        return getPortsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPort,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder>
          getPortsFieldBuilder() {
        if (portsBuilder_ == null) {
          portsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyPort,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder>(
                  ports_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          ports_ = null;
        }
        return portsBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer> from_ =
          java.util.Collections.emptyList();

      private void ensureFromIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          from_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer>(
                  from_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder>
          fromBuilder_;

      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer>
          getFromList() {
        if (fromBuilder_ == null) {
          return java.util.Collections.unmodifiableList(from_);
        } else {
          return fromBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public int getFromCount() {
        if (fromBuilder_ == null) {
          return from_.size();
        } else {
          return fromBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer getFrom(int index) {
        if (fromBuilder_ == null) {
          return from_.get(index);
        } else {
          return fromBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public Builder setFrom(
          int index, io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer value) {
        if (fromBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFromIsMutable();
          from_.set(index, value);
          onChanged();
        } else {
          fromBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public Builder setFrom(
          int index,
          io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder builderForValue) {
        if (fromBuilder_ == null) {
          ensureFromIsMutable();
          from_.set(index, builderForValue.build());
          onChanged();
        } else {
          fromBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public Builder addFrom(io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer value) {
        if (fromBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFromIsMutable();
          from_.add(value);
          onChanged();
        } else {
          fromBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public Builder addFrom(
          int index, io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer value) {
        if (fromBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFromIsMutable();
          from_.add(index, value);
          onChanged();
        } else {
          fromBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public Builder addFrom(
          io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder builderForValue) {
        if (fromBuilder_ == null) {
          ensureFromIsMutable();
          from_.add(builderForValue.build());
          onChanged();
        } else {
          fromBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public Builder addFrom(
          int index,
          io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder builderForValue) {
        if (fromBuilder_ == null) {
          ensureFromIsMutable();
          from_.add(index, builderForValue.build());
          onChanged();
        } else {
          fromBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public Builder addAllFrom(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer>
              values) {
        if (fromBuilder_ == null) {
          ensureFromIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, from_);
          onChanged();
        } else {
          fromBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public Builder clearFrom() {
        if (fromBuilder_ == null) {
          from_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          fromBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public Builder removeFrom(int index) {
        if (fromBuilder_ == null) {
          ensureFromIsMutable();
          from_.remove(index);
          onChanged();
        } else {
          fromBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder getFromBuilder(
          int index) {
        return getFromFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder getFromOrBuilder(
          int index) {
        if (fromBuilder_ == null) {
          return from_.get(index);
        } else {
          return fromBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder>
          getFromOrBuilderList() {
        if (fromBuilder_ != null) {
          return fromBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(from_);
        }
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder addFromBuilder() {
        return getFromFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder addFromBuilder(
          int index) {
        return getFromFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of sources which should be able to access the pods selected for this rule.
       * Items in this list are combined using a logical OR operation. If this field is
       * empty or missing, this rule matches all sources (traffic not restricted by
       * source). If this field is present and contains at least on item, this rule
       * allows traffic only if the traffic matches at least one item in the from list.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyPeer from = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder>
          getFromBuilderList() {
        return getFromFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder>
          getFromFieldBuilder() {
        if (fromBuilder_ == null) {
          fromBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder>(
                  from_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          from_ = null;
        }
        return fromBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.networking.v1.NetworkPolicyIngressRule)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.networking.v1.NetworkPolicyIngressRule)
    private static final io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule();
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<NetworkPolicyIngressRule> PARSER =
        new com.google.protobuf.AbstractParser<NetworkPolicyIngressRule>() {
          @java.lang.Override
          public NetworkPolicyIngressRule parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new NetworkPolicyIngressRule(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<NetworkPolicyIngressRule> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NetworkPolicyIngressRule> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface NetworkPolicyListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.networking.v1.NetworkPolicyList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicy> getItemsList();
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicy getItems(int index);
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicyOrBuilder getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * NetworkPolicyList is a list of NetworkPolicy objects.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.networking.v1.NetworkPolicyList}
   */
  public static final class NetworkPolicyList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.networking.v1.NetworkPolicyList)
      NetworkPolicyListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use NetworkPolicyList.newBuilder() to construct.
    private NetworkPolicyList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private NetworkPolicyList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private NetworkPolicyList(
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
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1Networking.NetworkPolicy>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Networking.NetworkPolicy.PARSER,
                        extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_NetworkPolicyList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_NetworkPolicyList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Networking.NetworkPolicyList.class,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicy> items_;
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicy> getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicy getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyOrBuilder getItemsOrBuilder(
        int index) {
      return items_.get(index);
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Networking.NetworkPolicyList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Networking.NetworkPolicyList other =
          (io.kubernetes.client.proto.V1Networking.NetworkPolicyList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyList parseFrom(
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
        io.kubernetes.client.proto.V1Networking.NetworkPolicyList prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * NetworkPolicyList is a list of NetworkPolicy objects.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.networking.v1.NetworkPolicyList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.networking.v1.NetworkPolicyList)
        io.kubernetes.client.proto.V1Networking.NetworkPolicyListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicyList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicyList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Networking.NetworkPolicyList.class,
                io.kubernetes.client.proto.V1Networking.NetworkPolicyList.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1Networking.NetworkPolicyList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getItemsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicyList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyList getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Networking.NetworkPolicyList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyList build() {
        io.kubernetes.client.proto.V1Networking.NetworkPolicyList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyList buildPartial() {
        io.kubernetes.client.proto.V1Networking.NetworkPolicyList result =
            new io.kubernetes.client.proto.V1Networking.NetworkPolicyList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Networking.NetworkPolicyList) {
          return mergeFrom((io.kubernetes.client.proto.V1Networking.NetworkPolicyList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Networking.NetworkPolicyList other) {
        if (other == io.kubernetes.client.proto.V1Networking.NetworkPolicyList.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
            }
          }
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
        io.kubernetes.client.proto.V1Networking.NetworkPolicyList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Networking.NetworkPolicyList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicy> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1Networking.NetworkPolicy>(
                  items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicy,
              io.kubernetes.client.proto.V1Networking.NetworkPolicy.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicy> getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicy getItems(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1Networking.NetworkPolicy value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1Networking.NetworkPolicy.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1Networking.NetworkPolicy value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1Networking.NetworkPolicy value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1Networking.NetworkPolicy.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1Networking.NetworkPolicy.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Networking.NetworkPolicy>
              values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicy.Builder getItemsBuilder(
          int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyOrBuilder getItemsOrBuilder(
          int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicy.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Networking.NetworkPolicy.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicy.Builder addItemsBuilder(
          int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1Networking.NetworkPolicy.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicy items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicy.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicy,
              io.kubernetes.client.proto.V1Networking.NetworkPolicy.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Networking.NetworkPolicy,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicy.Builder,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.networking.v1.NetworkPolicyList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.networking.v1.NetworkPolicyList)
    private static final io.kubernetes.client.proto.V1Networking.NetworkPolicyList DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Networking.NetworkPolicyList();
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<NetworkPolicyList> PARSER =
        new com.google.protobuf.AbstractParser<NetworkPolicyList>() {
          @java.lang.Override
          public NetworkPolicyList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new NetworkPolicyList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<NetworkPolicyList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NetworkPolicyList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface NetworkPolicyPeerOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.networking.v1.NetworkPolicyPeer)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * This is a label selector which selects Pods. This field follows standard label
     * selector semantics; if present but empty, it selects all pods.
     * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects
     * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
     * Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
     * </code>
     */
    boolean hasPodSelector();
    /**
     *
     *
     * <pre>
     * This is a label selector which selects Pods. This field follows standard label
     * selector semantics; if present but empty, it selects all pods.
     * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects
     * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
     * Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
     * </code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getPodSelector();
    /**
     *
     *
     * <pre>
     * This is a label selector which selects Pods. This field follows standard label
     * selector semantics; if present but empty, it selects all pods.
     * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects
     * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
     * Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
     * </code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getPodSelectorOrBuilder();

    /**
     *
     *
     * <pre>
     * Selects Namespaces using cluster-scoped labels. This field follows standard label
     * selector semantics; if present but empty, it selects all namespaces.
     * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects
     * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
     * Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 2;
     * </code>
     */
    boolean hasNamespaceSelector();
    /**
     *
     *
     * <pre>
     * Selects Namespaces using cluster-scoped labels. This field follows standard label
     * selector semantics; if present but empty, it selects all namespaces.
     * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects
     * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
     * Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 2;
     * </code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getNamespaceSelector();
    /**
     *
     *
     * <pre>
     * Selects Namespaces using cluster-scoped labels. This field follows standard label
     * selector semantics; if present but empty, it selects all namespaces.
     * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects
     * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
     * Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 2;
     * </code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getNamespaceSelectorOrBuilder();

    /**
     *
     *
     * <pre>
     * IPBlock defines policy on a particular IPBlock. If this field is set then
     * neither of the other fields can be.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.networking.v1.IPBlock ipBlock = 3;</code>
     */
    boolean hasIpBlock();
    /**
     *
     *
     * <pre>
     * IPBlock defines policy on a particular IPBlock. If this field is set then
     * neither of the other fields can be.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.networking.v1.IPBlock ipBlock = 3;</code>
     */
    io.kubernetes.client.proto.V1Networking.IPBlock getIpBlock();
    /**
     *
     *
     * <pre>
     * IPBlock defines policy on a particular IPBlock. If this field is set then
     * neither of the other fields can be.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.networking.v1.IPBlock ipBlock = 3;</code>
     */
    io.kubernetes.client.proto.V1Networking.IPBlockOrBuilder getIpBlockOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * NetworkPolicyPeer describes a peer to allow traffic from. Only certain combinations of
   * fields are allowed
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.networking.v1.NetworkPolicyPeer}
   */
  public static final class NetworkPolicyPeer extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.networking.v1.NetworkPolicyPeer)
      NetworkPolicyPeerOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use NetworkPolicyPeer.newBuilder() to construct.
    private NetworkPolicyPeer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private NetworkPolicyPeer() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private NetworkPolicyPeer(
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
                io.kubernetes.client.proto.Meta.LabelSelector.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = podSelector_.toBuilder();
                }
                podSelector_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(podSelector_);
                  podSelector_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Meta.LabelSelector.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = namespaceSelector_.toBuilder();
                }
                namespaceSelector_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(namespaceSelector_);
                  namespaceSelector_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1Networking.IPBlock.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = ipBlock_.toBuilder();
                }
                ipBlock_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Networking.IPBlock.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(ipBlock_);
                  ipBlock_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
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
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_NetworkPolicyPeer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_NetworkPolicyPeer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.class,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder.class);
    }

    private int bitField0_;
    public static final int PODSELECTOR_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.LabelSelector podSelector_;
    /**
     *
     *
     * <pre>
     * This is a label selector which selects Pods. This field follows standard label
     * selector semantics; if present but empty, it selects all pods.
     * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects
     * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
     * Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
     * </code>
     */
    public boolean hasPodSelector() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * This is a label selector which selects Pods. This field follows standard label
     * selector semantics; if present but empty, it selects all pods.
     * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects
     * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
     * Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelector getPodSelector() {
      return podSelector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : podSelector_;
    }
    /**
     *
     *
     * <pre>
     * This is a label selector which selects Pods. This field follows standard label
     * selector semantics; if present but empty, it selects all pods.
     * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects
     * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
     * Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getPodSelectorOrBuilder() {
      return podSelector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : podSelector_;
    }

    public static final int NAMESPACESELECTOR_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Meta.LabelSelector namespaceSelector_;
    /**
     *
     *
     * <pre>
     * Selects Namespaces using cluster-scoped labels. This field follows standard label
     * selector semantics; if present but empty, it selects all namespaces.
     * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects
     * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
     * Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 2;
     * </code>
     */
    public boolean hasNamespaceSelector() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Selects Namespaces using cluster-scoped labels. This field follows standard label
     * selector semantics; if present but empty, it selects all namespaces.
     * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects
     * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
     * Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 2;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelector getNamespaceSelector() {
      return namespaceSelector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : namespaceSelector_;
    }
    /**
     *
     *
     * <pre>
     * Selects Namespaces using cluster-scoped labels. This field follows standard label
     * selector semantics; if present but empty, it selects all namespaces.
     * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects
     * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
     * Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 2;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getNamespaceSelectorOrBuilder() {
      return namespaceSelector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : namespaceSelector_;
    }

    public static final int IPBLOCK_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1Networking.IPBlock ipBlock_;
    /**
     *
     *
     * <pre>
     * IPBlock defines policy on a particular IPBlock. If this field is set then
     * neither of the other fields can be.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.networking.v1.IPBlock ipBlock = 3;</code>
     */
    public boolean hasIpBlock() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * IPBlock defines policy on a particular IPBlock. If this field is set then
     * neither of the other fields can be.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.networking.v1.IPBlock ipBlock = 3;</code>
     */
    public io.kubernetes.client.proto.V1Networking.IPBlock getIpBlock() {
      return ipBlock_ == null
          ? io.kubernetes.client.proto.V1Networking.IPBlock.getDefaultInstance()
          : ipBlock_;
    }
    /**
     *
     *
     * <pre>
     * IPBlock defines policy on a particular IPBlock. If this field is set then
     * neither of the other fields can be.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.networking.v1.IPBlock ipBlock = 3;</code>
     */
    public io.kubernetes.client.proto.V1Networking.IPBlockOrBuilder getIpBlockOrBuilder() {
      return ipBlock_ == null
          ? io.kubernetes.client.proto.V1Networking.IPBlock.getDefaultInstance()
          : ipBlock_;
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getPodSelector());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getNamespaceSelector());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getIpBlock());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPodSelector());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getNamespaceSelector());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getIpBlock());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer other =
          (io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer) obj;

      boolean result = true;
      result = result && (hasPodSelector() == other.hasPodSelector());
      if (hasPodSelector()) {
        result = result && getPodSelector().equals(other.getPodSelector());
      }
      result = result && (hasNamespaceSelector() == other.hasNamespaceSelector());
      if (hasNamespaceSelector()) {
        result = result && getNamespaceSelector().equals(other.getNamespaceSelector());
      }
      result = result && (hasIpBlock() == other.hasIpBlock());
      if (hasIpBlock()) {
        result = result && getIpBlock().equals(other.getIpBlock());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasPodSelector()) {
        hash = (37 * hash) + PODSELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getPodSelector().hashCode();
      }
      if (hasNamespaceSelector()) {
        hash = (37 * hash) + NAMESPACESELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getNamespaceSelector().hashCode();
      }
      if (hasIpBlock()) {
        hash = (37 * hash) + IPBLOCK_FIELD_NUMBER;
        hash = (53 * hash) + getIpBlock().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer parseFrom(
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
        io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * NetworkPolicyPeer describes a peer to allow traffic from. Only certain combinations of
     * fields are allowed
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.networking.v1.NetworkPolicyPeer}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.networking.v1.NetworkPolicyPeer)
        io.kubernetes.client.proto.V1Networking.NetworkPolicyPeerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicyPeer_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicyPeer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.class,
                io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getPodSelectorFieldBuilder();
          getNamespaceSelectorFieldBuilder();
          getIpBlockFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (podSelectorBuilder_ == null) {
          podSelector_ = null;
        } else {
          podSelectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (namespaceSelectorBuilder_ == null) {
          namespaceSelector_ = null;
        } else {
          namespaceSelectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (ipBlockBuilder_ == null) {
          ipBlock_ = null;
        } else {
          ipBlockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicyPeer_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer build() {
        io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer buildPartial() {
        io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer result =
            new io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (podSelectorBuilder_ == null) {
          result.podSelector_ = podSelector_;
        } else {
          result.podSelector_ = podSelectorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (namespaceSelectorBuilder_ == null) {
          result.namespaceSelector_ = namespaceSelector_;
        } else {
          result.namespaceSelector_ = namespaceSelectorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (ipBlockBuilder_ == null) {
          result.ipBlock_ = ipBlock_;
        } else {
          result.ipBlock_ = ipBlockBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer) {
          return mergeFrom((io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer other) {
        if (other == io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer.getDefaultInstance())
          return this;
        if (other.hasPodSelector()) {
          mergePodSelector(other.getPodSelector());
        }
        if (other.hasNamespaceSelector()) {
          mergeNamespaceSelector(other.getNamespaceSelector());
        }
        if (other.hasIpBlock()) {
          mergeIpBlock(other.getIpBlock());
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
        io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.LabelSelector podSelector_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          podSelectorBuilder_;
      /**
       *
       *
       * <pre>
       * This is a label selector which selects Pods. This field follows standard label
       * selector semantics; if present but empty, it selects all pods.
       * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public boolean hasPodSelector() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * This is a label selector which selects Pods. This field follows standard label
       * selector semantics; if present but empty, it selects all pods.
       * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector getPodSelector() {
        if (podSelectorBuilder_ == null) {
          return podSelector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : podSelector_;
        } else {
          return podSelectorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * This is a label selector which selects Pods. This field follows standard label
       * selector semantics; if present but empty, it selects all pods.
       * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public Builder setPodSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (podSelectorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          podSelector_ = value;
          onChanged();
        } else {
          podSelectorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * This is a label selector which selects Pods. This field follows standard label
       * selector semantics; if present but empty, it selects all pods.
       * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public Builder setPodSelector(
          io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (podSelectorBuilder_ == null) {
          podSelector_ = builderForValue.build();
          onChanged();
        } else {
          podSelectorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * This is a label selector which selects Pods. This field follows standard label
       * selector semantics; if present but empty, it selects all pods.
       * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public Builder mergePodSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (podSelectorBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && podSelector_ != null
              && podSelector_
                  != io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()) {
            podSelector_ =
                io.kubernetes.client.proto.Meta.LabelSelector.newBuilder(podSelector_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            podSelector_ = value;
          }
          onChanged();
        } else {
          podSelectorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * This is a label selector which selects Pods. This field follows standard label
       * selector semantics; if present but empty, it selects all pods.
       * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public Builder clearPodSelector() {
        if (podSelectorBuilder_ == null) {
          podSelector_ = null;
          onChanged();
        } else {
          podSelectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * This is a label selector which selects Pods. This field follows standard label
       * selector semantics; if present but empty, it selects all pods.
       * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getPodSelectorBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPodSelectorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * This is a label selector which selects Pods. This field follows standard label
       * selector semantics; if present but empty, it selects all pods.
       * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getPodSelectorOrBuilder() {
        if (podSelectorBuilder_ != null) {
          return podSelectorBuilder_.getMessageOrBuilder();
        } else {
          return podSelector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : podSelector_;
        }
      }
      /**
       *
       *
       * <pre>
       * This is a label selector which selects Pods. This field follows standard label
       * selector semantics; if present but empty, it selects all pods.
       * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getPodSelectorFieldBuilder() {
        if (podSelectorBuilder_ == null) {
          podSelectorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.LabelSelector,
                  io.kubernetes.client.proto.Meta.LabelSelector.Builder,
                  io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>(
                  getPodSelector(), getParentForChildren(), isClean());
          podSelector_ = null;
        }
        return podSelectorBuilder_;
      }

      private io.kubernetes.client.proto.Meta.LabelSelector namespaceSelector_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          namespaceSelectorBuilder_;
      /**
       *
       *
       * <pre>
       * Selects Namespaces using cluster-scoped labels. This field follows standard label
       * selector semantics; if present but empty, it selects all namespaces.
       * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 2;
       * </code>
       */
      public boolean hasNamespaceSelector() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Selects Namespaces using cluster-scoped labels. This field follows standard label
       * selector semantics; if present but empty, it selects all namespaces.
       * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector getNamespaceSelector() {
        if (namespaceSelectorBuilder_ == null) {
          return namespaceSelector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : namespaceSelector_;
        } else {
          return namespaceSelectorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Selects Namespaces using cluster-scoped labels. This field follows standard label
       * selector semantics; if present but empty, it selects all namespaces.
       * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 2;
       * </code>
       */
      public Builder setNamespaceSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (namespaceSelectorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          namespaceSelector_ = value;
          onChanged();
        } else {
          namespaceSelectorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Selects Namespaces using cluster-scoped labels. This field follows standard label
       * selector semantics; if present but empty, it selects all namespaces.
       * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 2;
       * </code>
       */
      public Builder setNamespaceSelector(
          io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (namespaceSelectorBuilder_ == null) {
          namespaceSelector_ = builderForValue.build();
          onChanged();
        } else {
          namespaceSelectorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Selects Namespaces using cluster-scoped labels. This field follows standard label
       * selector semantics; if present but empty, it selects all namespaces.
       * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 2;
       * </code>
       */
      public Builder mergeNamespaceSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (namespaceSelectorBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && namespaceSelector_ != null
              && namespaceSelector_
                  != io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()) {
            namespaceSelector_ =
                io.kubernetes.client.proto.Meta.LabelSelector.newBuilder(namespaceSelector_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            namespaceSelector_ = value;
          }
          onChanged();
        } else {
          namespaceSelectorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Selects Namespaces using cluster-scoped labels. This field follows standard label
       * selector semantics; if present but empty, it selects all namespaces.
       * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 2;
       * </code>
       */
      public Builder clearNamespaceSelector() {
        if (namespaceSelectorBuilder_ == null) {
          namespaceSelector_ = null;
          onChanged();
        } else {
          namespaceSelectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Selects Namespaces using cluster-scoped labels. This field follows standard label
       * selector semantics; if present but empty, it selects all namespaces.
       * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getNamespaceSelectorBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getNamespaceSelectorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Selects Namespaces using cluster-scoped labels. This field follows standard label
       * selector semantics; if present but empty, it selects all namespaces.
       * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder
          getNamespaceSelectorOrBuilder() {
        if (namespaceSelectorBuilder_ != null) {
          return namespaceSelectorBuilder_.getMessageOrBuilder();
        } else {
          return namespaceSelector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : namespaceSelector_;
        }
      }
      /**
       *
       *
       * <pre>
       * Selects Namespaces using cluster-scoped labels. This field follows standard label
       * selector semantics; if present but empty, it selects all namespaces.
       * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects
       * the Pods matching PodSelector in the Namespaces selected by NamespaceSelector.
       * Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector namespaceSelector = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getNamespaceSelectorFieldBuilder() {
        if (namespaceSelectorBuilder_ == null) {
          namespaceSelectorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.LabelSelector,
                  io.kubernetes.client.proto.Meta.LabelSelector.Builder,
                  io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>(
                  getNamespaceSelector(), getParentForChildren(), isClean());
          namespaceSelector_ = null;
        }
        return namespaceSelectorBuilder_;
      }

      private io.kubernetes.client.proto.V1Networking.IPBlock ipBlock_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.IPBlock,
              io.kubernetes.client.proto.V1Networking.IPBlock.Builder,
              io.kubernetes.client.proto.V1Networking.IPBlockOrBuilder>
          ipBlockBuilder_;
      /**
       *
       *
       * <pre>
       * IPBlock defines policy on a particular IPBlock. If this field is set then
       * neither of the other fields can be.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.IPBlock ipBlock = 3;</code>
       */
      public boolean hasIpBlock() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * IPBlock defines policy on a particular IPBlock. If this field is set then
       * neither of the other fields can be.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.IPBlock ipBlock = 3;</code>
       */
      public io.kubernetes.client.proto.V1Networking.IPBlock getIpBlock() {
        if (ipBlockBuilder_ == null) {
          return ipBlock_ == null
              ? io.kubernetes.client.proto.V1Networking.IPBlock.getDefaultInstance()
              : ipBlock_;
        } else {
          return ipBlockBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * IPBlock defines policy on a particular IPBlock. If this field is set then
       * neither of the other fields can be.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.IPBlock ipBlock = 3;</code>
       */
      public Builder setIpBlock(io.kubernetes.client.proto.V1Networking.IPBlock value) {
        if (ipBlockBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ipBlock_ = value;
          onChanged();
        } else {
          ipBlockBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * IPBlock defines policy on a particular IPBlock. If this field is set then
       * neither of the other fields can be.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.IPBlock ipBlock = 3;</code>
       */
      public Builder setIpBlock(
          io.kubernetes.client.proto.V1Networking.IPBlock.Builder builderForValue) {
        if (ipBlockBuilder_ == null) {
          ipBlock_ = builderForValue.build();
          onChanged();
        } else {
          ipBlockBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * IPBlock defines policy on a particular IPBlock. If this field is set then
       * neither of the other fields can be.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.IPBlock ipBlock = 3;</code>
       */
      public Builder mergeIpBlock(io.kubernetes.client.proto.V1Networking.IPBlock value) {
        if (ipBlockBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && ipBlock_ != null
              && ipBlock_ != io.kubernetes.client.proto.V1Networking.IPBlock.getDefaultInstance()) {
            ipBlock_ =
                io.kubernetes.client.proto.V1Networking.IPBlock.newBuilder(ipBlock_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            ipBlock_ = value;
          }
          onChanged();
        } else {
          ipBlockBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * IPBlock defines policy on a particular IPBlock. If this field is set then
       * neither of the other fields can be.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.IPBlock ipBlock = 3;</code>
       */
      public Builder clearIpBlock() {
        if (ipBlockBuilder_ == null) {
          ipBlock_ = null;
          onChanged();
        } else {
          ipBlockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * IPBlock defines policy on a particular IPBlock. If this field is set then
       * neither of the other fields can be.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.IPBlock ipBlock = 3;</code>
       */
      public io.kubernetes.client.proto.V1Networking.IPBlock.Builder getIpBlockBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getIpBlockFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * IPBlock defines policy on a particular IPBlock. If this field is set then
       * neither of the other fields can be.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.IPBlock ipBlock = 3;</code>
       */
      public io.kubernetes.client.proto.V1Networking.IPBlockOrBuilder getIpBlockOrBuilder() {
        if (ipBlockBuilder_ != null) {
          return ipBlockBuilder_.getMessageOrBuilder();
        } else {
          return ipBlock_ == null
              ? io.kubernetes.client.proto.V1Networking.IPBlock.getDefaultInstance()
              : ipBlock_;
        }
      }
      /**
       *
       *
       * <pre>
       * IPBlock defines policy on a particular IPBlock. If this field is set then
       * neither of the other fields can be.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.networking.v1.IPBlock ipBlock = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.IPBlock,
              io.kubernetes.client.proto.V1Networking.IPBlock.Builder,
              io.kubernetes.client.proto.V1Networking.IPBlockOrBuilder>
          getIpBlockFieldBuilder() {
        if (ipBlockBuilder_ == null) {
          ipBlockBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Networking.IPBlock,
                  io.kubernetes.client.proto.V1Networking.IPBlock.Builder,
                  io.kubernetes.client.proto.V1Networking.IPBlockOrBuilder>(
                  getIpBlock(), getParentForChildren(), isClean());
          ipBlock_ = null;
        }
        return ipBlockBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.networking.v1.NetworkPolicyPeer)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.networking.v1.NetworkPolicyPeer)
    private static final io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer();
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<NetworkPolicyPeer> PARSER =
        new com.google.protobuf.AbstractParser<NetworkPolicyPeer>() {
          @java.lang.Override
          public NetworkPolicyPeer parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new NetworkPolicyPeer(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<NetworkPolicyPeer> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NetworkPolicyPeer> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyPeer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface NetworkPolicyPortOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.networking.v1.NetworkPolicyPort)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this
     * field defaults to TCP.
     * +optional
     * </pre>
     *
     * <code>optional string protocol = 1;</code>
     */
    boolean hasProtocol();
    /**
     *
     *
     * <pre>
     * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this
     * field defaults to TCP.
     * +optional
     * </pre>
     *
     * <code>optional string protocol = 1;</code>
     */
    java.lang.String getProtocol();
    /**
     *
     *
     * <pre>
     * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this
     * field defaults to TCP.
     * +optional
     * </pre>
     *
     * <code>optional string protocol = 1;</code>
     */
    com.google.protobuf.ByteString getProtocolBytes();

    /**
     *
     *
     * <pre>
     * The port on the given protocol. This can either be a numerical or named port on
     * a pod. If this field is not provided, this matches all port names and numbers.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString port = 2;</code>
     */
    boolean hasPort();
    /**
     *
     *
     * <pre>
     * The port on the given protocol. This can either be a numerical or named port on
     * a pod. If this field is not provided, this matches all port names and numbers.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString port = 2;</code>
     */
    io.kubernetes.client.proto.IntStr.IntOrString getPort();
    /**
     *
     *
     * <pre>
     * The port on the given protocol. This can either be a numerical or named port on
     * a pod. If this field is not provided, this matches all port names and numbers.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString port = 2;</code>
     */
    io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder getPortOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * NetworkPolicyPort describes a port to allow traffic on
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.networking.v1.NetworkPolicyPort}
   */
  public static final class NetworkPolicyPort extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.networking.v1.NetworkPolicyPort)
      NetworkPolicyPortOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use NetworkPolicyPort.newBuilder() to construct.
    private NetworkPolicyPort(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private NetworkPolicyPort() {
      protocol_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private NetworkPolicyPort(
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
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                protocol_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.IntStr.IntOrString.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = port_.toBuilder();
                }
                port_ =
                    input.readMessage(
                        io.kubernetes.client.proto.IntStr.IntOrString.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(port_);
                  port_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
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
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_NetworkPolicyPort_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_NetworkPolicyPort_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.class,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder.class);
    }

    private int bitField0_;
    public static final int PROTOCOL_FIELD_NUMBER = 1;
    private volatile java.lang.Object protocol_;
    /**
     *
     *
     * <pre>
     * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this
     * field defaults to TCP.
     * +optional
     * </pre>
     *
     * <code>optional string protocol = 1;</code>
     */
    public boolean hasProtocol() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this
     * field defaults to TCP.
     * +optional
     * </pre>
     *
     * <code>optional string protocol = 1;</code>
     */
    public java.lang.String getProtocol() {
      java.lang.Object ref = protocol_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          protocol_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this
     * field defaults to TCP.
     * +optional
     * </pre>
     *
     * <code>optional string protocol = 1;</code>
     */
    public com.google.protobuf.ByteString getProtocolBytes() {
      java.lang.Object ref = protocol_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        protocol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PORT_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.IntStr.IntOrString port_;
    /**
     *
     *
     * <pre>
     * The port on the given protocol. This can either be a numerical or named port on
     * a pod. If this field is not provided, this matches all port names and numbers.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString port = 2;</code>
     */
    public boolean hasPort() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * The port on the given protocol. This can either be a numerical or named port on
     * a pod. If this field is not provided, this matches all port names and numbers.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString port = 2;</code>
     */
    public io.kubernetes.client.proto.IntStr.IntOrString getPort() {
      return port_ == null
          ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
          : port_;
    }
    /**
     *
     *
     * <pre>
     * The port on the given protocol. This can either be a numerical or named port on
     * a pod. If this field is not provided, this matches all port names and numbers.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString port = 2;</code>
     */
    public io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder getPortOrBuilder() {
      return port_ == null
          ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
          : port_;
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, protocol_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getPort());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, protocol_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPort());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Networking.NetworkPolicyPort)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Networking.NetworkPolicyPort other =
          (io.kubernetes.client.proto.V1Networking.NetworkPolicyPort) obj;

      boolean result = true;
      result = result && (hasProtocol() == other.hasProtocol());
      if (hasProtocol()) {
        result = result && getProtocol().equals(other.getProtocol());
      }
      result = result && (hasPort() == other.hasPort());
      if (hasPort()) {
        result = result && getPort().equals(other.getPort());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasProtocol()) {
        hash = (37 * hash) + PROTOCOL_FIELD_NUMBER;
        hash = (53 * hash) + getProtocol().hashCode();
      }
      if (hasPort()) {
        hash = (37 * hash) + PORT_FIELD_NUMBER;
        hash = (53 * hash) + getPort().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPort parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPort parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPort parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPort parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPort parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPort parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPort parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPort parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPort parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPort parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPort parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPort parseFrom(
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
        io.kubernetes.client.proto.V1Networking.NetworkPolicyPort prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * NetworkPolicyPort describes a port to allow traffic on
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.networking.v1.NetworkPolicyPort}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.networking.v1.NetworkPolicyPort)
        io.kubernetes.client.proto.V1Networking.NetworkPolicyPortOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicyPort_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicyPort_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.class,
                io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getPortFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        protocol_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (portBuilder_ == null) {
          port_ = null;
        } else {
          portBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicyPort_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPort getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPort build() {
        io.kubernetes.client.proto.V1Networking.NetworkPolicyPort result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyPort buildPartial() {
        io.kubernetes.client.proto.V1Networking.NetworkPolicyPort result =
            new io.kubernetes.client.proto.V1Networking.NetworkPolicyPort(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.protocol_ = protocol_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (portBuilder_ == null) {
          result.port_ = port_;
        } else {
          result.port_ = portBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Networking.NetworkPolicyPort) {
          return mergeFrom((io.kubernetes.client.proto.V1Networking.NetworkPolicyPort) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Networking.NetworkPolicyPort other) {
        if (other == io.kubernetes.client.proto.V1Networking.NetworkPolicyPort.getDefaultInstance())
          return this;
        if (other.hasProtocol()) {
          bitField0_ |= 0x00000001;
          protocol_ = other.protocol_;
          onChanged();
        }
        if (other.hasPort()) {
          mergePort(other.getPort());
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
        io.kubernetes.client.proto.V1Networking.NetworkPolicyPort parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Networking.NetworkPolicyPort) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object protocol_ = "";
      /**
       *
       *
       * <pre>
       * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this
       * field defaults to TCP.
       * +optional
       * </pre>
       *
       * <code>optional string protocol = 1;</code>
       */
      public boolean hasProtocol() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this
       * field defaults to TCP.
       * +optional
       * </pre>
       *
       * <code>optional string protocol = 1;</code>
       */
      public java.lang.String getProtocol() {
        java.lang.Object ref = protocol_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            protocol_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this
       * field defaults to TCP.
       * +optional
       * </pre>
       *
       * <code>optional string protocol = 1;</code>
       */
      public com.google.protobuf.ByteString getProtocolBytes() {
        java.lang.Object ref = protocol_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          protocol_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this
       * field defaults to TCP.
       * +optional
       * </pre>
       *
       * <code>optional string protocol = 1;</code>
       */
      public Builder setProtocol(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        protocol_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this
       * field defaults to TCP.
       * +optional
       * </pre>
       *
       * <code>optional string protocol = 1;</code>
       */
      public Builder clearProtocol() {
        bitField0_ = (bitField0_ & ~0x00000001);
        protocol_ = getDefaultInstance().getProtocol();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The protocol (TCP, UDP, or SCTP) which traffic must match. If not specified, this
       * field defaults to TCP.
       * +optional
       * </pre>
       *
       * <code>optional string protocol = 1;</code>
       */
      public Builder setProtocolBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        protocol_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.IntStr.IntOrString port_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.IntStr.IntOrString,
              io.kubernetes.client.proto.IntStr.IntOrString.Builder,
              io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder>
          portBuilder_;
      /**
       *
       *
       * <pre>
       * The port on the given protocol. This can either be a numerical or named port on
       * a pod. If this field is not provided, this matches all port names and numbers.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString port = 2;</code>
       */
      public boolean hasPort() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * The port on the given protocol. This can either be a numerical or named port on
       * a pod. If this field is not provided, this matches all port names and numbers.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString port = 2;</code>
       */
      public io.kubernetes.client.proto.IntStr.IntOrString getPort() {
        if (portBuilder_ == null) {
          return port_ == null
              ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
              : port_;
        } else {
          return portBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * The port on the given protocol. This can either be a numerical or named port on
       * a pod. If this field is not provided, this matches all port names and numbers.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString port = 2;</code>
       */
      public Builder setPort(io.kubernetes.client.proto.IntStr.IntOrString value) {
        if (portBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          port_ = value;
          onChanged();
        } else {
          portBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The port on the given protocol. This can either be a numerical or named port on
       * a pod. If this field is not provided, this matches all port names and numbers.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString port = 2;</code>
       */
      public Builder setPort(
          io.kubernetes.client.proto.IntStr.IntOrString.Builder builderForValue) {
        if (portBuilder_ == null) {
          port_ = builderForValue.build();
          onChanged();
        } else {
          portBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The port on the given protocol. This can either be a numerical or named port on
       * a pod. If this field is not provided, this matches all port names and numbers.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString port = 2;</code>
       */
      public Builder mergePort(io.kubernetes.client.proto.IntStr.IntOrString value) {
        if (portBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && port_ != null
              && port_ != io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()) {
            port_ =
                io.kubernetes.client.proto.IntStr.IntOrString.newBuilder(port_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            port_ = value;
          }
          onChanged();
        } else {
          portBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The port on the given protocol. This can either be a numerical or named port on
       * a pod. If this field is not provided, this matches all port names and numbers.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString port = 2;</code>
       */
      public Builder clearPort() {
        if (portBuilder_ == null) {
          port_ = null;
          onChanged();
        } else {
          portBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * The port on the given protocol. This can either be a numerical or named port on
       * a pod. If this field is not provided, this matches all port names and numbers.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString port = 2;</code>
       */
      public io.kubernetes.client.proto.IntStr.IntOrString.Builder getPortBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getPortFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * The port on the given protocol. This can either be a numerical or named port on
       * a pod. If this field is not provided, this matches all port names and numbers.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString port = 2;</code>
       */
      public io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder getPortOrBuilder() {
        if (portBuilder_ != null) {
          return portBuilder_.getMessageOrBuilder();
        } else {
          return port_ == null
              ? io.kubernetes.client.proto.IntStr.IntOrString.getDefaultInstance()
              : port_;
        }
      }
      /**
       *
       *
       * <pre>
       * The port on the given protocol. This can either be a numerical or named port on
       * a pod. If this field is not provided, this matches all port names and numbers.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.util.intstr.IntOrString port = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.IntStr.IntOrString,
              io.kubernetes.client.proto.IntStr.IntOrString.Builder,
              io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder>
          getPortFieldBuilder() {
        if (portBuilder_ == null) {
          portBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.IntStr.IntOrString,
                  io.kubernetes.client.proto.IntStr.IntOrString.Builder,
                  io.kubernetes.client.proto.IntStr.IntOrStringOrBuilder>(
                  getPort(), getParentForChildren(), isClean());
          port_ = null;
        }
        return portBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.networking.v1.NetworkPolicyPort)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.networking.v1.NetworkPolicyPort)
    private static final io.kubernetes.client.proto.V1Networking.NetworkPolicyPort DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Networking.NetworkPolicyPort();
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicyPort getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<NetworkPolicyPort> PARSER =
        new com.google.protobuf.AbstractParser<NetworkPolicyPort>() {
          @java.lang.Override
          public NetworkPolicyPort parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new NetworkPolicyPort(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<NetworkPolicyPort> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NetworkPolicyPort> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyPort getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface NetworkPolicySpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.networking.v1.NetworkPolicySpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Selects the pods to which this NetworkPolicy object applies. The array of
     * ingress rules is applied to any pods selected by this field. Multiple network
     * policies can select the same set of pods. In this case, the ingress rules for
     * each are combined additively. This field is NOT optional and follows standard
     * label selector semantics. An empty podSelector matches all pods in this
     * namespace.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
     * </code>
     */
    boolean hasPodSelector();
    /**
     *
     *
     * <pre>
     * Selects the pods to which this NetworkPolicy object applies. The array of
     * ingress rules is applied to any pods selected by this field. Multiple network
     * policies can select the same set of pods. In this case, the ingress rules for
     * each are combined additively. This field is NOT optional and follows standard
     * label selector semantics. An empty podSelector matches all pods in this
     * namespace.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
     * </code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getPodSelector();
    /**
     *
     *
     * <pre>
     * Selects the pods to which this NetworkPolicy object applies. The array of
     * ingress rules is applied to any pods selected by this field. Multiple network
     * policies can select the same set of pods. In this case, the ingress rules for
     * each are combined additively. This field is NOT optional and follows standard
     * label selector semantics. An empty podSelector matches all pods in this
     * namespace.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
     * </code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getPodSelectorOrBuilder();

    /**
     *
     *
     * <pre>
     * List of ingress rules to be applied to the selected pods. Traffic is allowed to
     * a pod if there are no NetworkPolicies selecting the pod
     * (and cluster policy otherwise allows the traffic), OR if the traffic source is
     * the pod's local node, OR if the traffic matches at least one ingress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy does not allow any traffic (and serves
     * solely to ensure that the pods it selects are isolated by default)
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule>
        getIngressList();
    /**
     *
     *
     * <pre>
     * List of ingress rules to be applied to the selected pods. Traffic is allowed to
     * a pod if there are no NetworkPolicies selecting the pod
     * (and cluster policy otherwise allows the traffic), OR if the traffic source is
     * the pod's local node, OR if the traffic matches at least one ingress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy does not allow any traffic (and serves
     * solely to ensure that the pods it selects are isolated by default)
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule getIngress(int index);
    /**
     *
     *
     * <pre>
     * List of ingress rules to be applied to the selected pods. Traffic is allowed to
     * a pod if there are no NetworkPolicies selecting the pod
     * (and cluster policy otherwise allows the traffic), OR if the traffic source is
     * the pod's local node, OR if the traffic matches at least one ingress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy does not allow any traffic (and serves
     * solely to ensure that the pods it selects are isolated by default)
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
     */
    int getIngressCount();
    /**
     *
     *
     * <pre>
     * List of ingress rules to be applied to the selected pods. Traffic is allowed to
     * a pod if there are no NetworkPolicies selecting the pod
     * (and cluster policy otherwise allows the traffic), OR if the traffic source is
     * the pod's local node, OR if the traffic matches at least one ingress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy does not allow any traffic (and serves
     * solely to ensure that the pods it selects are isolated by default)
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
     */
    java.util.List<
            ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRuleOrBuilder>
        getIngressOrBuilderList();
    /**
     *
     *
     * <pre>
     * List of ingress rules to be applied to the selected pods. Traffic is allowed to
     * a pod if there are no NetworkPolicies selecting the pod
     * (and cluster policy otherwise allows the traffic), OR if the traffic source is
     * the pod's local node, OR if the traffic matches at least one ingress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy does not allow any traffic (and serves
     * solely to ensure that the pods it selects are isolated by default)
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRuleOrBuilder getIngressOrBuilder(
        int index);

    /**
     *
     *
     * <pre>
     * List of egress rules to be applied to the selected pods. Outgoing traffic is
     * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
     * otherwise allows the traffic), OR if the traffic matches at least one egress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
     * solely to ensure that the pods it selects are isolated by default).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule> getEgressList();
    /**
     *
     *
     * <pre>
     * List of egress rules to be applied to the selected pods. Outgoing traffic is
     * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
     * otherwise allows the traffic), OR if the traffic matches at least one egress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
     * solely to ensure that the pods it selects are isolated by default).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule getEgress(int index);
    /**
     *
     *
     * <pre>
     * List of egress rules to be applied to the selected pods. Outgoing traffic is
     * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
     * otherwise allows the traffic), OR if the traffic matches at least one egress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
     * solely to ensure that the pods it selects are isolated by default).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
     */
    int getEgressCount();
    /**
     *
     *
     * <pre>
     * List of egress rules to be applied to the selected pods. Outgoing traffic is
     * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
     * otherwise allows the traffic), OR if the traffic matches at least one egress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
     * solely to ensure that the pods it selects are isolated by default).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
     */
    java.util.List<
            ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRuleOrBuilder>
        getEgressOrBuilderList();
    /**
     *
     *
     * <pre>
     * List of egress rules to be applied to the selected pods. Outgoing traffic is
     * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
     * otherwise allows the traffic), OR if the traffic matches at least one egress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
     * solely to ensure that the pods it selects are isolated by default).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
     */
    io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRuleOrBuilder getEgressOrBuilder(
        int index);

    /**
     *
     *
     * <pre>
     * List of rule types that the NetworkPolicy relates to.
     * Valid options are Ingress, Egress, or Ingress,Egress.
     * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
     * policies that contain an Egress section are assumed to affect Egress, and all policies
     * (whether or not they contain an Ingress section) are assumed to affect Ingress.
     * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
     * Likewise, if you want to write a policy that specifies that no egress is allowed,
     * you must specify a policyTypes value that include "Egress" (since such a policy would not include
     * an Egress section and would otherwise default to just [ "Ingress" ]).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated string policyTypes = 4;</code>
     */
    java.util.List<java.lang.String> getPolicyTypesList();
    /**
     *
     *
     * <pre>
     * List of rule types that the NetworkPolicy relates to.
     * Valid options are Ingress, Egress, or Ingress,Egress.
     * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
     * policies that contain an Egress section are assumed to affect Egress, and all policies
     * (whether or not they contain an Ingress section) are assumed to affect Ingress.
     * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
     * Likewise, if you want to write a policy that specifies that no egress is allowed,
     * you must specify a policyTypes value that include "Egress" (since such a policy would not include
     * an Egress section and would otherwise default to just [ "Ingress" ]).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated string policyTypes = 4;</code>
     */
    int getPolicyTypesCount();
    /**
     *
     *
     * <pre>
     * List of rule types that the NetworkPolicy relates to.
     * Valid options are Ingress, Egress, or Ingress,Egress.
     * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
     * policies that contain an Egress section are assumed to affect Egress, and all policies
     * (whether or not they contain an Ingress section) are assumed to affect Ingress.
     * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
     * Likewise, if you want to write a policy that specifies that no egress is allowed,
     * you must specify a policyTypes value that include "Egress" (since such a policy would not include
     * an Egress section and would otherwise default to just [ "Ingress" ]).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated string policyTypes = 4;</code>
     */
    java.lang.String getPolicyTypes(int index);
    /**
     *
     *
     * <pre>
     * List of rule types that the NetworkPolicy relates to.
     * Valid options are Ingress, Egress, or Ingress,Egress.
     * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
     * policies that contain an Egress section are assumed to affect Egress, and all policies
     * (whether or not they contain an Ingress section) are assumed to affect Ingress.
     * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
     * Likewise, if you want to write a policy that specifies that no egress is allowed,
     * you must specify a policyTypes value that include "Egress" (since such a policy would not include
     * an Egress section and would otherwise default to just [ "Ingress" ]).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated string policyTypes = 4;</code>
     */
    com.google.protobuf.ByteString getPolicyTypesBytes(int index);
  }
  /**
   *
   *
   * <pre>
   * NetworkPolicySpec provides the specification of a NetworkPolicy
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.networking.v1.NetworkPolicySpec}
   */
  public static final class NetworkPolicySpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.networking.v1.NetworkPolicySpec)
      NetworkPolicySpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use NetworkPolicySpec.newBuilder() to construct.
    private NetworkPolicySpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private NetworkPolicySpec() {
      ingress_ = java.util.Collections.emptyList();
      egress_ = java.util.Collections.emptyList();
      policyTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private NetworkPolicySpec(
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
                io.kubernetes.client.proto.Meta.LabelSelector.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = podSelector_.toBuilder();
                }
                podSelector_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(podSelector_);
                  podSelector_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  ingress_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule>();
                  mutable_bitField0_ |= 0x00000002;
                }
                ingress_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.PARSER,
                        extensionRegistry));
                break;
              }
            case 26:
              {
                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                  egress_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule>();
                  mutable_bitField0_ |= 0x00000004;
                }
                egress_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.PARSER,
                        extensionRegistry));
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                  policyTypes_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000008;
                }
                policyTypes_.add(bs);
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          ingress_ = java.util.Collections.unmodifiableList(ingress_);
        }
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          egress_ = java.util.Collections.unmodifiableList(egress_);
        }
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          policyTypes_ = policyTypes_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_NetworkPolicySpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Networking
          .internal_static_k8s_io_api_networking_v1_NetworkPolicySpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.class,
              io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.Builder.class);
    }

    private int bitField0_;
    public static final int PODSELECTOR_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.LabelSelector podSelector_;
    /**
     *
     *
     * <pre>
     * Selects the pods to which this NetworkPolicy object applies. The array of
     * ingress rules is applied to any pods selected by this field. Multiple network
     * policies can select the same set of pods. In this case, the ingress rules for
     * each are combined additively. This field is NOT optional and follows standard
     * label selector semantics. An empty podSelector matches all pods in this
     * namespace.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
     * </code>
     */
    public boolean hasPodSelector() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Selects the pods to which this NetworkPolicy object applies. The array of
     * ingress rules is applied to any pods selected by this field. Multiple network
     * policies can select the same set of pods. In this case, the ingress rules for
     * each are combined additively. This field is NOT optional and follows standard
     * label selector semantics. An empty podSelector matches all pods in this
     * namespace.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelector getPodSelector() {
      return podSelector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : podSelector_;
    }
    /**
     *
     *
     * <pre>
     * Selects the pods to which this NetworkPolicy object applies. The array of
     * ingress rules is applied to any pods selected by this field. Multiple network
     * policies can select the same set of pods. In this case, the ingress rules for
     * each are combined additively. This field is NOT optional and follows standard
     * label selector semantics. An empty podSelector matches all pods in this
     * namespace.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getPodSelectorOrBuilder() {
      return podSelector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : podSelector_;
    }

    public static final int INGRESS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule>
        ingress_;
    /**
     *
     *
     * <pre>
     * List of ingress rules to be applied to the selected pods. Traffic is allowed to
     * a pod if there are no NetworkPolicies selecting the pod
     * (and cluster policy otherwise allows the traffic), OR if the traffic source is
     * the pod's local node, OR if the traffic matches at least one ingress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy does not allow any traffic (and serves
     * solely to ensure that the pods it selects are isolated by default)
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule>
        getIngressList() {
      return ingress_;
    }
    /**
     *
     *
     * <pre>
     * List of ingress rules to be applied to the selected pods. Traffic is allowed to
     * a pod if there are no NetworkPolicies selecting the pod
     * (and cluster policy otherwise allows the traffic), OR if the traffic source is
     * the pod's local node, OR if the traffic matches at least one ingress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy does not allow any traffic (and serves
     * solely to ensure that the pods it selects are isolated by default)
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRuleOrBuilder>
        getIngressOrBuilderList() {
      return ingress_;
    }
    /**
     *
     *
     * <pre>
     * List of ingress rules to be applied to the selected pods. Traffic is allowed to
     * a pod if there are no NetworkPolicies selecting the pod
     * (and cluster policy otherwise allows the traffic), OR if the traffic source is
     * the pod's local node, OR if the traffic matches at least one ingress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy does not allow any traffic (and serves
     * solely to ensure that the pods it selects are isolated by default)
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
     */
    public int getIngressCount() {
      return ingress_.size();
    }
    /**
     *
     *
     * <pre>
     * List of ingress rules to be applied to the selected pods. Traffic is allowed to
     * a pod if there are no NetworkPolicies selecting the pod
     * (and cluster policy otherwise allows the traffic), OR if the traffic source is
     * the pod's local node, OR if the traffic matches at least one ingress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy does not allow any traffic (and serves
     * solely to ensure that the pods it selects are isolated by default)
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule getIngress(int index) {
      return ingress_.get(index);
    }
    /**
     *
     *
     * <pre>
     * List of ingress rules to be applied to the selected pods. Traffic is allowed to
     * a pod if there are no NetworkPolicies selecting the pod
     * (and cluster policy otherwise allows the traffic), OR if the traffic source is
     * the pod's local node, OR if the traffic matches at least one ingress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy does not allow any traffic (and serves
     * solely to ensure that the pods it selects are isolated by default)
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRuleOrBuilder
        getIngressOrBuilder(int index) {
      return ingress_.get(index);
    }

    public static final int EGRESS_FIELD_NUMBER = 3;
    private java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule> egress_;
    /**
     *
     *
     * <pre>
     * List of egress rules to be applied to the selected pods. Outgoing traffic is
     * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
     * otherwise allows the traffic), OR if the traffic matches at least one egress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
     * solely to ensure that the pods it selects are isolated by default).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule>
        getEgressList() {
      return egress_;
    }
    /**
     *
     *
     * <pre>
     * List of egress rules to be applied to the selected pods. Outgoing traffic is
     * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
     * otherwise allows the traffic), OR if the traffic matches at least one egress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
     * solely to ensure that the pods it selects are isolated by default).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRuleOrBuilder>
        getEgressOrBuilderList() {
      return egress_;
    }
    /**
     *
     *
     * <pre>
     * List of egress rules to be applied to the selected pods. Outgoing traffic is
     * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
     * otherwise allows the traffic), OR if the traffic matches at least one egress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
     * solely to ensure that the pods it selects are isolated by default).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
     */
    public int getEgressCount() {
      return egress_.size();
    }
    /**
     *
     *
     * <pre>
     * List of egress rules to be applied to the selected pods. Outgoing traffic is
     * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
     * otherwise allows the traffic), OR if the traffic matches at least one egress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
     * solely to ensure that the pods it selects are isolated by default).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule getEgress(int index) {
      return egress_.get(index);
    }
    /**
     *
     *
     * <pre>
     * List of egress rules to be applied to the selected pods. Outgoing traffic is
     * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
     * otherwise allows the traffic), OR if the traffic matches at least one egress rule
     * across all of the NetworkPolicy objects whose podSelector matches the pod. If
     * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
     * solely to ensure that the pods it selects are isolated by default).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
     */
    public io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRuleOrBuilder
        getEgressOrBuilder(int index) {
      return egress_.get(index);
    }

    public static final int POLICYTYPES_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList policyTypes_;
    /**
     *
     *
     * <pre>
     * List of rule types that the NetworkPolicy relates to.
     * Valid options are Ingress, Egress, or Ingress,Egress.
     * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
     * policies that contain an Egress section are assumed to affect Egress, and all policies
     * (whether or not they contain an Ingress section) are assumed to affect Ingress.
     * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
     * Likewise, if you want to write a policy that specifies that no egress is allowed,
     * you must specify a policyTypes value that include "Egress" (since such a policy would not include
     * an Egress section and would otherwise default to just [ "Ingress" ]).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated string policyTypes = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList getPolicyTypesList() {
      return policyTypes_;
    }
    /**
     *
     *
     * <pre>
     * List of rule types that the NetworkPolicy relates to.
     * Valid options are Ingress, Egress, or Ingress,Egress.
     * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
     * policies that contain an Egress section are assumed to affect Egress, and all policies
     * (whether or not they contain an Ingress section) are assumed to affect Ingress.
     * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
     * Likewise, if you want to write a policy that specifies that no egress is allowed,
     * you must specify a policyTypes value that include "Egress" (since such a policy would not include
     * an Egress section and would otherwise default to just [ "Ingress" ]).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated string policyTypes = 4;</code>
     */
    public int getPolicyTypesCount() {
      return policyTypes_.size();
    }
    /**
     *
     *
     * <pre>
     * List of rule types that the NetworkPolicy relates to.
     * Valid options are Ingress, Egress, or Ingress,Egress.
     * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
     * policies that contain an Egress section are assumed to affect Egress, and all policies
     * (whether or not they contain an Ingress section) are assumed to affect Ingress.
     * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
     * Likewise, if you want to write a policy that specifies that no egress is allowed,
     * you must specify a policyTypes value that include "Egress" (since such a policy would not include
     * an Egress section and would otherwise default to just [ "Ingress" ]).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated string policyTypes = 4;</code>
     */
    public java.lang.String getPolicyTypes(int index) {
      return policyTypes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * List of rule types that the NetworkPolicy relates to.
     * Valid options are Ingress, Egress, or Ingress,Egress.
     * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
     * policies that contain an Egress section are assumed to affect Egress, and all policies
     * (whether or not they contain an Ingress section) are assumed to affect Ingress.
     * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
     * Likewise, if you want to write a policy that specifies that no egress is allowed,
     * you must specify a policyTypes value that include "Egress" (since such a policy would not include
     * an Egress section and would otherwise default to just [ "Ingress" ]).
     * This field is beta-level in 1.8
     * +optional
     * </pre>
     *
     * <code>repeated string policyTypes = 4;</code>
     */
    public com.google.protobuf.ByteString getPolicyTypesBytes(int index) {
      return policyTypes_.getByteString(index);
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getPodSelector());
      }
      for (int i = 0; i < ingress_.size(); i++) {
        output.writeMessage(2, ingress_.get(i));
      }
      for (int i = 0; i < egress_.size(); i++) {
        output.writeMessage(3, egress_.get(i));
      }
      for (int i = 0; i < policyTypes_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, policyTypes_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPodSelector());
      }
      for (int i = 0; i < ingress_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, ingress_.get(i));
      }
      for (int i = 0; i < egress_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, egress_.get(i));
      }
      {
        int dataSize = 0;
        for (int i = 0; i < policyTypes_.size(); i++) {
          dataSize += computeStringSizeNoTag(policyTypes_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getPolicyTypesList().size();
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Networking.NetworkPolicySpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Networking.NetworkPolicySpec other =
          (io.kubernetes.client.proto.V1Networking.NetworkPolicySpec) obj;

      boolean result = true;
      result = result && (hasPodSelector() == other.hasPodSelector());
      if (hasPodSelector()) {
        result = result && getPodSelector().equals(other.getPodSelector());
      }
      result = result && getIngressList().equals(other.getIngressList());
      result = result && getEgressList().equals(other.getEgressList());
      result = result && getPolicyTypesList().equals(other.getPolicyTypesList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasPodSelector()) {
        hash = (37 * hash) + PODSELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getPodSelector().hashCode();
      }
      if (getIngressCount() > 0) {
        hash = (37 * hash) + INGRESS_FIELD_NUMBER;
        hash = (53 * hash) + getIngressList().hashCode();
      }
      if (getEgressCount() > 0) {
        hash = (37 * hash) + EGRESS_FIELD_NUMBER;
        hash = (53 * hash) + getEgressList().hashCode();
      }
      if (getPolicyTypesCount() > 0) {
        hash = (37 * hash) + POLICYTYPES_FIELD_NUMBER;
        hash = (53 * hash) + getPolicyTypesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicySpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicySpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicySpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicySpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicySpec parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicySpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicySpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicySpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicySpec parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicySpec parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicySpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicySpec parseFrom(
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
        io.kubernetes.client.proto.V1Networking.NetworkPolicySpec prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * NetworkPolicySpec provides the specification of a NetworkPolicy
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.networking.v1.NetworkPolicySpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.networking.v1.NetworkPolicySpec)
        io.kubernetes.client.proto.V1Networking.NetworkPolicySpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicySpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicySpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.class,
                io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getPodSelectorFieldBuilder();
          getIngressFieldBuilder();
          getEgressFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (podSelectorBuilder_ == null) {
          podSelector_ = null;
        } else {
          podSelectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (ingressBuilder_ == null) {
          ingress_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ingressBuilder_.clear();
        }
        if (egressBuilder_ == null) {
          egress_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          egressBuilder_.clear();
        }
        policyTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Networking
            .internal_static_k8s_io_api_networking_v1_NetworkPolicySpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicySpec getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicySpec build() {
        io.kubernetes.client.proto.V1Networking.NetworkPolicySpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Networking.NetworkPolicySpec buildPartial() {
        io.kubernetes.client.proto.V1Networking.NetworkPolicySpec result =
            new io.kubernetes.client.proto.V1Networking.NetworkPolicySpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (podSelectorBuilder_ == null) {
          result.podSelector_ = podSelector_;
        } else {
          result.podSelector_ = podSelectorBuilder_.build();
        }
        if (ingressBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            ingress_ = java.util.Collections.unmodifiableList(ingress_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.ingress_ = ingress_;
        } else {
          result.ingress_ = ingressBuilder_.build();
        }
        if (egressBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            egress_ = java.util.Collections.unmodifiableList(egress_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.egress_ = egress_;
        } else {
          result.egress_ = egressBuilder_.build();
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          policyTypes_ = policyTypes_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.policyTypes_ = policyTypes_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Networking.NetworkPolicySpec) {
          return mergeFrom((io.kubernetes.client.proto.V1Networking.NetworkPolicySpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Networking.NetworkPolicySpec other) {
        if (other == io.kubernetes.client.proto.V1Networking.NetworkPolicySpec.getDefaultInstance())
          return this;
        if (other.hasPodSelector()) {
          mergePodSelector(other.getPodSelector());
        }
        if (ingressBuilder_ == null) {
          if (!other.ingress_.isEmpty()) {
            if (ingress_.isEmpty()) {
              ingress_ = other.ingress_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureIngressIsMutable();
              ingress_.addAll(other.ingress_);
            }
            onChanged();
          }
        } else {
          if (!other.ingress_.isEmpty()) {
            if (ingressBuilder_.isEmpty()) {
              ingressBuilder_.dispose();
              ingressBuilder_ = null;
              ingress_ = other.ingress_;
              bitField0_ = (bitField0_ & ~0x00000002);
              ingressBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getIngressFieldBuilder()
                      : null;
            } else {
              ingressBuilder_.addAllMessages(other.ingress_);
            }
          }
        }
        if (egressBuilder_ == null) {
          if (!other.egress_.isEmpty()) {
            if (egress_.isEmpty()) {
              egress_ = other.egress_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureEgressIsMutable();
              egress_.addAll(other.egress_);
            }
            onChanged();
          }
        } else {
          if (!other.egress_.isEmpty()) {
            if (egressBuilder_.isEmpty()) {
              egressBuilder_.dispose();
              egressBuilder_ = null;
              egress_ = other.egress_;
              bitField0_ = (bitField0_ & ~0x00000004);
              egressBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getEgressFieldBuilder()
                      : null;
            } else {
              egressBuilder_.addAllMessages(other.egress_);
            }
          }
        }
        if (!other.policyTypes_.isEmpty()) {
          if (policyTypes_.isEmpty()) {
            policyTypes_ = other.policyTypes_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensurePolicyTypesIsMutable();
            policyTypes_.addAll(other.policyTypes_);
          }
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
        io.kubernetes.client.proto.V1Networking.NetworkPolicySpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Networking.NetworkPolicySpec) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.LabelSelector podSelector_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          podSelectorBuilder_;
      /**
       *
       *
       * <pre>
       * Selects the pods to which this NetworkPolicy object applies. The array of
       * ingress rules is applied to any pods selected by this field. Multiple network
       * policies can select the same set of pods. In this case, the ingress rules for
       * each are combined additively. This field is NOT optional and follows standard
       * label selector semantics. An empty podSelector matches all pods in this
       * namespace.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public boolean hasPodSelector() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Selects the pods to which this NetworkPolicy object applies. The array of
       * ingress rules is applied to any pods selected by this field. Multiple network
       * policies can select the same set of pods. In this case, the ingress rules for
       * each are combined additively. This field is NOT optional and follows standard
       * label selector semantics. An empty podSelector matches all pods in this
       * namespace.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector getPodSelector() {
        if (podSelectorBuilder_ == null) {
          return podSelector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : podSelector_;
        } else {
          return podSelectorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Selects the pods to which this NetworkPolicy object applies. The array of
       * ingress rules is applied to any pods selected by this field. Multiple network
       * policies can select the same set of pods. In this case, the ingress rules for
       * each are combined additively. This field is NOT optional and follows standard
       * label selector semantics. An empty podSelector matches all pods in this
       * namespace.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public Builder setPodSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (podSelectorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          podSelector_ = value;
          onChanged();
        } else {
          podSelectorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Selects the pods to which this NetworkPolicy object applies. The array of
       * ingress rules is applied to any pods selected by this field. Multiple network
       * policies can select the same set of pods. In this case, the ingress rules for
       * each are combined additively. This field is NOT optional and follows standard
       * label selector semantics. An empty podSelector matches all pods in this
       * namespace.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public Builder setPodSelector(
          io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (podSelectorBuilder_ == null) {
          podSelector_ = builderForValue.build();
          onChanged();
        } else {
          podSelectorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Selects the pods to which this NetworkPolicy object applies. The array of
       * ingress rules is applied to any pods selected by this field. Multiple network
       * policies can select the same set of pods. In this case, the ingress rules for
       * each are combined additively. This field is NOT optional and follows standard
       * label selector semantics. An empty podSelector matches all pods in this
       * namespace.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public Builder mergePodSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (podSelectorBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && podSelector_ != null
              && podSelector_
                  != io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()) {
            podSelector_ =
                io.kubernetes.client.proto.Meta.LabelSelector.newBuilder(podSelector_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            podSelector_ = value;
          }
          onChanged();
        } else {
          podSelectorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Selects the pods to which this NetworkPolicy object applies. The array of
       * ingress rules is applied to any pods selected by this field. Multiple network
       * policies can select the same set of pods. In this case, the ingress rules for
       * each are combined additively. This field is NOT optional and follows standard
       * label selector semantics. An empty podSelector matches all pods in this
       * namespace.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public Builder clearPodSelector() {
        if (podSelectorBuilder_ == null) {
          podSelector_ = null;
          onChanged();
        } else {
          podSelectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Selects the pods to which this NetworkPolicy object applies. The array of
       * ingress rules is applied to any pods selected by this field. Multiple network
       * policies can select the same set of pods. In this case, the ingress rules for
       * each are combined additively. This field is NOT optional and follows standard
       * label selector semantics. An empty podSelector matches all pods in this
       * namespace.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getPodSelectorBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPodSelectorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Selects the pods to which this NetworkPolicy object applies. The array of
       * ingress rules is applied to any pods selected by this field. Multiple network
       * policies can select the same set of pods. In this case, the ingress rules for
       * each are combined additively. This field is NOT optional and follows standard
       * label selector semantics. An empty podSelector matches all pods in this
       * namespace.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getPodSelectorOrBuilder() {
        if (podSelectorBuilder_ != null) {
          return podSelectorBuilder_.getMessageOrBuilder();
        } else {
          return podSelector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : podSelector_;
        }
      }
      /**
       *
       *
       * <pre>
       * Selects the pods to which this NetworkPolicy object applies. The array of
       * ingress rules is applied to any pods selected by this field. Multiple network
       * policies can select the same set of pods. In this case, the ingress rules for
       * each are combined additively. This field is NOT optional and follows standard
       * label selector semantics. An empty podSelector matches all pods in this
       * namespace.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector podSelector = 1;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getPodSelectorFieldBuilder() {
        if (podSelectorBuilder_ == null) {
          podSelectorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.LabelSelector,
                  io.kubernetes.client.proto.Meta.LabelSelector.Builder,
                  io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>(
                  getPodSelector(), getParentForChildren(), isClean());
          podSelector_ = null;
        }
        return podSelectorBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule>
          ingress_ = java.util.Collections.emptyList();

      private void ensureIngressIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          ingress_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule>(ingress_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRuleOrBuilder>
          ingressBuilder_;

      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule>
          getIngressList() {
        if (ingressBuilder_ == null) {
          return java.util.Collections.unmodifiableList(ingress_);
        } else {
          return ingressBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public int getIngressCount() {
        if (ingressBuilder_ == null) {
          return ingress_.size();
        } else {
          return ingressBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule getIngress(
          int index) {
        if (ingressBuilder_ == null) {
          return ingress_.get(index);
        } else {
          return ingressBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public Builder setIngress(
          int index, io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule value) {
        if (ingressBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureIngressIsMutable();
          ingress_.set(index, value);
          onChanged();
        } else {
          ingressBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public Builder setIngress(
          int index,
          io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.Builder
              builderForValue) {
        if (ingressBuilder_ == null) {
          ensureIngressIsMutable();
          ingress_.set(index, builderForValue.build());
          onChanged();
        } else {
          ingressBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public Builder addIngress(
          io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule value) {
        if (ingressBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureIngressIsMutable();
          ingress_.add(value);
          onChanged();
        } else {
          ingressBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public Builder addIngress(
          int index, io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule value) {
        if (ingressBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureIngressIsMutable();
          ingress_.add(index, value);
          onChanged();
        } else {
          ingressBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public Builder addIngress(
          io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.Builder
              builderForValue) {
        if (ingressBuilder_ == null) {
          ensureIngressIsMutable();
          ingress_.add(builderForValue.build());
          onChanged();
        } else {
          ingressBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public Builder addIngress(
          int index,
          io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.Builder
              builderForValue) {
        if (ingressBuilder_ == null) {
          ensureIngressIsMutable();
          ingress_.add(index, builderForValue.build());
          onChanged();
        } else {
          ingressBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public Builder addAllIngress(
          java.lang.Iterable<
                  ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule>
              values) {
        if (ingressBuilder_ == null) {
          ensureIngressIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, ingress_);
          onChanged();
        } else {
          ingressBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public Builder clearIngress() {
        if (ingressBuilder_ == null) {
          ingress_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          ingressBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public Builder removeIngress(int index) {
        if (ingressBuilder_ == null) {
          ensureIngressIsMutable();
          ingress_.remove(index);
          onChanged();
        } else {
          ingressBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.Builder
          getIngressBuilder(int index) {
        return getIngressFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRuleOrBuilder
          getIngressOrBuilder(int index) {
        if (ingressBuilder_ == null) {
          return ingress_.get(index);
        } else {
          return ingressBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRuleOrBuilder>
          getIngressOrBuilderList() {
        if (ingressBuilder_ != null) {
          return ingressBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(ingress_);
        }
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.Builder
          addIngressBuilder() {
        return getIngressFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.Builder
          addIngressBuilder(int index) {
        return getIngressFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of ingress rules to be applied to the selected pods. Traffic is allowed to
       * a pod if there are no NetworkPolicies selecting the pod
       * (and cluster policy otherwise allows the traffic), OR if the traffic source is
       * the pod's local node, OR if the traffic matches at least one ingress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy does not allow any traffic (and serves
       * solely to ensure that the pods it selects are isolated by default)
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyIngressRule ingress = 2;</code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.Builder>
          getIngressBuilderList() {
        return getIngressFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRuleOrBuilder>
          getIngressFieldBuilder() {
        if (ingressBuilder_ == null) {
          ingressBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRule.Builder,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyIngressRuleOrBuilder>(
                  ingress_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          ingress_ = null;
        }
        return ingressBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule>
          egress_ = java.util.Collections.emptyList();

      private void ensureEgressIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          egress_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule>(egress_);
          bitField0_ |= 0x00000004;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRuleOrBuilder>
          egressBuilder_;

      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule>
          getEgressList() {
        if (egressBuilder_ == null) {
          return java.util.Collections.unmodifiableList(egress_);
        } else {
          return egressBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public int getEgressCount() {
        if (egressBuilder_ == null) {
          return egress_.size();
        } else {
          return egressBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule getEgress(int index) {
        if (egressBuilder_ == null) {
          return egress_.get(index);
        } else {
          return egressBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public Builder setEgress(
          int index, io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule value) {
        if (egressBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEgressIsMutable();
          egress_.set(index, value);
          onChanged();
        } else {
          egressBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public Builder setEgress(
          int index,
          io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.Builder builderForValue) {
        if (egressBuilder_ == null) {
          ensureEgressIsMutable();
          egress_.set(index, builderForValue.build());
          onChanged();
        } else {
          egressBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public Builder addEgress(
          io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule value) {
        if (egressBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEgressIsMutable();
          egress_.add(value);
          onChanged();
        } else {
          egressBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public Builder addEgress(
          int index, io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule value) {
        if (egressBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEgressIsMutable();
          egress_.add(index, value);
          onChanged();
        } else {
          egressBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public Builder addEgress(
          io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.Builder builderForValue) {
        if (egressBuilder_ == null) {
          ensureEgressIsMutable();
          egress_.add(builderForValue.build());
          onChanged();
        } else {
          egressBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public Builder addEgress(
          int index,
          io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.Builder builderForValue) {
        if (egressBuilder_ == null) {
          ensureEgressIsMutable();
          egress_.add(index, builderForValue.build());
          onChanged();
        } else {
          egressBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public Builder addAllEgress(
          java.lang.Iterable<
                  ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule>
              values) {
        if (egressBuilder_ == null) {
          ensureEgressIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, egress_);
          onChanged();
        } else {
          egressBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public Builder clearEgress() {
        if (egressBuilder_ == null) {
          egress_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          egressBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public Builder removeEgress(int index) {
        if (egressBuilder_ == null) {
          ensureEgressIsMutable();
          egress_.remove(index);
          onChanged();
        } else {
          egressBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.Builder
          getEgressBuilder(int index) {
        return getEgressFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRuleOrBuilder
          getEgressOrBuilder(int index) {
        if (egressBuilder_ == null) {
          return egress_.get(index);
        } else {
          return egressBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRuleOrBuilder>
          getEgressOrBuilderList() {
        if (egressBuilder_ != null) {
          return egressBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(egress_);
        }
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.Builder
          addEgressBuilder() {
        return getEgressFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.Builder
          addEgressBuilder(int index) {
        return getEgressFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * List of egress rules to be applied to the selected pods. Outgoing traffic is
       * allowed if there are no NetworkPolicies selecting the pod (and cluster policy
       * otherwise allows the traffic), OR if the traffic matches at least one egress rule
       * across all of the NetworkPolicy objects whose podSelector matches the pod. If
       * this field is empty then this NetworkPolicy limits all outgoing traffic (and serves
       * solely to ensure that the pods it selects are isolated by default).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.networking.v1.NetworkPolicyEgressRule egress = 3;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.Builder>
          getEgressBuilderList() {
        return getEgressFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.Builder,
              io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRuleOrBuilder>
          getEgressFieldBuilder() {
        if (egressBuilder_ == null) {
          egressBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRule.Builder,
                  io.kubernetes.client.proto.V1Networking.NetworkPolicyEgressRuleOrBuilder>(
                  egress_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          egress_ = null;
        }
        return egressBuilder_;
      }

      private com.google.protobuf.LazyStringList policyTypes_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensurePolicyTypesIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          policyTypes_ = new com.google.protobuf.LazyStringArrayList(policyTypes_);
          bitField0_ |= 0x00000008;
        }
      }
      /**
       *
       *
       * <pre>
       * List of rule types that the NetworkPolicy relates to.
       * Valid options are Ingress, Egress, or Ingress,Egress.
       * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
       * policies that contain an Egress section are assumed to affect Egress, and all policies
       * (whether or not they contain an Ingress section) are assumed to affect Ingress.
       * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
       * Likewise, if you want to write a policy that specifies that no egress is allowed,
       * you must specify a policyTypes value that include "Egress" (since such a policy would not include
       * an Egress section and would otherwise default to just [ "Ingress" ]).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated string policyTypes = 4;</code>
       */
      public com.google.protobuf.ProtocolStringList getPolicyTypesList() {
        return policyTypes_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * List of rule types that the NetworkPolicy relates to.
       * Valid options are Ingress, Egress, or Ingress,Egress.
       * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
       * policies that contain an Egress section are assumed to affect Egress, and all policies
       * (whether or not they contain an Ingress section) are assumed to affect Ingress.
       * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
       * Likewise, if you want to write a policy that specifies that no egress is allowed,
       * you must specify a policyTypes value that include "Egress" (since such a policy would not include
       * an Egress section and would otherwise default to just [ "Ingress" ]).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated string policyTypes = 4;</code>
       */
      public int getPolicyTypesCount() {
        return policyTypes_.size();
      }
      /**
       *
       *
       * <pre>
       * List of rule types that the NetworkPolicy relates to.
       * Valid options are Ingress, Egress, or Ingress,Egress.
       * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
       * policies that contain an Egress section are assumed to affect Egress, and all policies
       * (whether or not they contain an Ingress section) are assumed to affect Ingress.
       * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
       * Likewise, if you want to write a policy that specifies that no egress is allowed,
       * you must specify a policyTypes value that include "Egress" (since such a policy would not include
       * an Egress section and would otherwise default to just [ "Ingress" ]).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated string policyTypes = 4;</code>
       */
      public java.lang.String getPolicyTypes(int index) {
        return policyTypes_.get(index);
      }
      /**
       *
       *
       * <pre>
       * List of rule types that the NetworkPolicy relates to.
       * Valid options are Ingress, Egress, or Ingress,Egress.
       * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
       * policies that contain an Egress section are assumed to affect Egress, and all policies
       * (whether or not they contain an Ingress section) are assumed to affect Ingress.
       * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
       * Likewise, if you want to write a policy that specifies that no egress is allowed,
       * you must specify a policyTypes value that include "Egress" (since such a policy would not include
       * an Egress section and would otherwise default to just [ "Ingress" ]).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated string policyTypes = 4;</code>
       */
      public com.google.protobuf.ByteString getPolicyTypesBytes(int index) {
        return policyTypes_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * List of rule types that the NetworkPolicy relates to.
       * Valid options are Ingress, Egress, or Ingress,Egress.
       * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
       * policies that contain an Egress section are assumed to affect Egress, and all policies
       * (whether or not they contain an Ingress section) are assumed to affect Ingress.
       * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
       * Likewise, if you want to write a policy that specifies that no egress is allowed,
       * you must specify a policyTypes value that include "Egress" (since such a policy would not include
       * an Egress section and would otherwise default to just [ "Ingress" ]).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated string policyTypes = 4;</code>
       */
      public Builder setPolicyTypes(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolicyTypesIsMutable();
        policyTypes_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of rule types that the NetworkPolicy relates to.
       * Valid options are Ingress, Egress, or Ingress,Egress.
       * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
       * policies that contain an Egress section are assumed to affect Egress, and all policies
       * (whether or not they contain an Ingress section) are assumed to affect Ingress.
       * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
       * Likewise, if you want to write a policy that specifies that no egress is allowed,
       * you must specify a policyTypes value that include "Egress" (since such a policy would not include
       * an Egress section and would otherwise default to just [ "Ingress" ]).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated string policyTypes = 4;</code>
       */
      public Builder addPolicyTypes(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolicyTypesIsMutable();
        policyTypes_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of rule types that the NetworkPolicy relates to.
       * Valid options are Ingress, Egress, or Ingress,Egress.
       * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
       * policies that contain an Egress section are assumed to affect Egress, and all policies
       * (whether or not they contain an Ingress section) are assumed to affect Ingress.
       * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
       * Likewise, if you want to write a policy that specifies that no egress is allowed,
       * you must specify a policyTypes value that include "Egress" (since such a policy would not include
       * an Egress section and would otherwise default to just [ "Ingress" ]).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated string policyTypes = 4;</code>
       */
      public Builder addAllPolicyTypes(java.lang.Iterable<java.lang.String> values) {
        ensurePolicyTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, policyTypes_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of rule types that the NetworkPolicy relates to.
       * Valid options are Ingress, Egress, or Ingress,Egress.
       * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
       * policies that contain an Egress section are assumed to affect Egress, and all policies
       * (whether or not they contain an Ingress section) are assumed to affect Ingress.
       * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
       * Likewise, if you want to write a policy that specifies that no egress is allowed,
       * you must specify a policyTypes value that include "Egress" (since such a policy would not include
       * an Egress section and would otherwise default to just [ "Ingress" ]).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated string policyTypes = 4;</code>
       */
      public Builder clearPolicyTypes() {
        policyTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * List of rule types that the NetworkPolicy relates to.
       * Valid options are Ingress, Egress, or Ingress,Egress.
       * If this field is not specified, it will default based on the existence of Ingress or Egress rules;
       * policies that contain an Egress section are assumed to affect Egress, and all policies
       * (whether or not they contain an Ingress section) are assumed to affect Ingress.
       * If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ].
       * Likewise, if you want to write a policy that specifies that no egress is allowed,
       * you must specify a policyTypes value that include "Egress" (since such a policy would not include
       * an Egress section and would otherwise default to just [ "Ingress" ]).
       * This field is beta-level in 1.8
       * +optional
       * </pre>
       *
       * <code>repeated string policyTypes = 4;</code>
       */
      public Builder addPolicyTypesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolicyTypesIsMutable();
        policyTypes_.add(value);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.networking.v1.NetworkPolicySpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.networking.v1.NetworkPolicySpec)
    private static final io.kubernetes.client.proto.V1Networking.NetworkPolicySpec DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Networking.NetworkPolicySpec();
    }

    public static io.kubernetes.client.proto.V1Networking.NetworkPolicySpec getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<NetworkPolicySpec> PARSER =
        new com.google.protobuf.AbstractParser<NetworkPolicySpec>() {
          @java.lang.Override
          public NetworkPolicySpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new NetworkPolicySpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<NetworkPolicySpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NetworkPolicySpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Networking.NetworkPolicySpec getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_networking_v1_IPBlock_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_networking_v1_IPBlock_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_networking_v1_NetworkPolicy_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_networking_v1_NetworkPolicy_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_networking_v1_NetworkPolicyEgressRule_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_networking_v1_NetworkPolicyEgressRule_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_networking_v1_NetworkPolicyIngressRule_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_networking_v1_NetworkPolicyIngressRule_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_networking_v1_NetworkPolicyList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_networking_v1_NetworkPolicyList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_networking_v1_NetworkPolicyPeer_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_networking_v1_NetworkPolicyPeer_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_networking_v1_NetworkPolicyPort_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_networking_v1_NetworkPolicyPort_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_networking_v1_NetworkPolicySpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_networking_v1_NetworkPolicySpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(k8s.io/api/networking/v1/generated.pro"
          + "to\022\030k8s.io.api.networking.v1\032\"k8s.io/api"
          + "/core/v1/generated.proto\0324k8s.io/apimach"
          + "inery/pkg/apis/meta/v1/generated.proto\032/"
          + "k8s.io/apimachinery/pkg/runtime/generate"
          + "d.proto\0326k8s.io/apimachinery/pkg/runtime"
          + "/schema/generated.proto\0323k8s.io/apimachi"
          + "nery/pkg/util/intstr/generated.proto\"\'\n\007"
          + "IPBlock\022\014\n\004cidr\030\001 \001(\t\022\016\n\006except\030\002 \003(\t\"\216\001"
          + "\n\rNetworkPolicy\022B\n\010metadata\030\001 \001(\01320.k8s."
          + "io.apimachinery.pkg.apis.meta.v1.ObjectM"
          + "eta\0229\n\004spec\030\002 \001(\0132+.k8s.io.api.networkin"
          + "g.v1.NetworkPolicySpec\"\216\001\n\027NetworkPolicy"
          + "EgressRule\022:\n\005ports\030\001 \003(\0132+.k8s.io.api.n"
          + "etworking.v1.NetworkPolicyPort\0227\n\002to\030\002 \003"
          + "(\0132+.k8s.io.api.networking.v1.NetworkPol"
          + "icyPeer\"\221\001\n\030NetworkPolicyIngressRule\022:\n\005"
          + "ports\030\001 \003(\0132+.k8s.io.api.networking.v1.N"
          + "etworkPolicyPort\0229\n\004from\030\002 \003(\0132+.k8s.io."
          + "api.networking.v1.NetworkPolicyPeer\"\215\001\n\021"
          + "NetworkPolicyList\022@\n\010metadata\030\001 \001(\0132..k8"
          + "s.io.apimachinery.pkg.apis.meta.v1.ListM"
          + "eta\0226\n\005items\030\002 \003(\0132\'.k8s.io.api.networki"
          + "ng.v1.NetworkPolicy\"\341\001\n\021NetworkPolicyPee"
          + "r\022H\n\013podSelector\030\001 \001(\01323.k8s.io.apimachi"
          + "nery.pkg.apis.meta.v1.LabelSelector\022N\n\021n"
          + "amespaceSelector\030\002 \001(\01323.k8s.io.apimachi"
          + "nery.pkg.apis.meta.v1.LabelSelector\0222\n\007i"
          + "pBlock\030\003 \001(\0132!.k8s.io.api.networking.v1."
          + "IPBlock\"e\n\021NetworkPolicyPort\022\020\n\010protocol"
          + "\030\001 \001(\t\022>\n\004port\030\002 \001(\01320.k8s.io.apimachine"
          + "ry.pkg.util.intstr.IntOrString\"\372\001\n\021Netwo"
          + "rkPolicySpec\022H\n\013podSelector\030\001 \001(\01323.k8s."
          + "io.apimachinery.pkg.apis.meta.v1.LabelSe"
          + "lector\022C\n\007ingress\030\002 \003(\01322.k8s.io.api.net"
          + "working.v1.NetworkPolicyIngressRule\022A\n\006e"
          + "gress\030\003 \003(\01321.k8s.io.api.networking.v1.N"
          + "etworkPolicyEgressRule\022\023\n\013policyTypes\030\004 "
          + "\003(\tB.\n\032io.kubernetes.client.protoB\014V1Net"
          + "workingZ\002v1"
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
          io.kubernetes.client.proto.V1.getDescriptor(),
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
          io.kubernetes.client.proto.IntStr.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_networking_v1_IPBlock_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_networking_v1_IPBlock_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_networking_v1_IPBlock_descriptor,
            new java.lang.String[] {
              "Cidr", "Except",
            });
    internal_static_k8s_io_api_networking_v1_NetworkPolicy_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_networking_v1_NetworkPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_networking_v1_NetworkPolicy_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec",
            });
    internal_static_k8s_io_api_networking_v1_NetworkPolicyEgressRule_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_networking_v1_NetworkPolicyEgressRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_networking_v1_NetworkPolicyEgressRule_descriptor,
            new java.lang.String[] {
              "Ports", "To",
            });
    internal_static_k8s_io_api_networking_v1_NetworkPolicyIngressRule_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_networking_v1_NetworkPolicyIngressRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_networking_v1_NetworkPolicyIngressRule_descriptor,
            new java.lang.String[] {
              "Ports", "From",
            });
    internal_static_k8s_io_api_networking_v1_NetworkPolicyList_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_k8s_io_api_networking_v1_NetworkPolicyList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_networking_v1_NetworkPolicyList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_networking_v1_NetworkPolicyPeer_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_k8s_io_api_networking_v1_NetworkPolicyPeer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_networking_v1_NetworkPolicyPeer_descriptor,
            new java.lang.String[] {
              "PodSelector", "NamespaceSelector", "IpBlock",
            });
    internal_static_k8s_io_api_networking_v1_NetworkPolicyPort_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_k8s_io_api_networking_v1_NetworkPolicyPort_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_networking_v1_NetworkPolicyPort_descriptor,
            new java.lang.String[] {
              "Protocol", "Port",
            });
    internal_static_k8s_io_api_networking_v1_NetworkPolicySpec_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_k8s_io_api_networking_v1_NetworkPolicySpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_networking_v1_NetworkPolicySpec_descriptor,
            new java.lang.String[] {
              "PodSelector", "Ingress", "Egress", "PolicyTypes",
            });
    io.kubernetes.client.proto.V1.getDescriptor();
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
    io.kubernetes.client.proto.IntStr.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}