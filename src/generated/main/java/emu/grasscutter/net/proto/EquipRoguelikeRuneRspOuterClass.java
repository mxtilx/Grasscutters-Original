// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EquipRoguelikeRuneRsp.proto

package emu.grasscutter.net.proto;

public final class EquipRoguelikeRuneRspOuterClass {
  private EquipRoguelikeRuneRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EquipRoguelikeRuneRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EquipRoguelikeRuneRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 rune_list = 14;</code>
     * @return A list containing the runeList.
     */
    java.util.List<java.lang.Integer> getRuneListList();
    /**
     * <code>repeated uint32 rune_list = 14;</code>
     * @return The count of runeList.
     */
    int getRuneListCount();
    /**
     * <code>repeated uint32 rune_list = 14;</code>
     * @param index The index of the element to return.
     * @return The runeList at the given index.
     */
    int getRuneList(int index);
  }
  /**
   * <pre>
   * Name: BDJCALIKJMN
   * CmdId: 8572
   * </pre>
   *
   * Protobuf type {@code EquipRoguelikeRuneRsp}
   */
  public static final class EquipRoguelikeRuneRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EquipRoguelikeRuneRsp)
      EquipRoguelikeRuneRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EquipRoguelikeRuneRsp.newBuilder() to construct.
    private EquipRoguelikeRuneRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EquipRoguelikeRuneRsp() {
      runeList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EquipRoguelikeRuneRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EquipRoguelikeRuneRsp(
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
            case 56: {

              retcode_ = input.readInt32();
              break;
            }
            case 112: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                runeList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              runeList_.addInt(input.readUInt32());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                runeList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                runeList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          runeList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.internal_static_EquipRoguelikeRuneRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.internal_static_EquipRoguelikeRuneRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp.class, emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int RUNE_LIST_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList runeList_;
    /**
     * <code>repeated uint32 rune_list = 14;</code>
     * @return A list containing the runeList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getRuneListList() {
      return runeList_;
    }
    /**
     * <code>repeated uint32 rune_list = 14;</code>
     * @return The count of runeList.
     */
    public int getRuneListCount() {
      return runeList_.size();
    }
    /**
     * <code>repeated uint32 rune_list = 14;</code>
     * @param index The index of the element to return.
     * @return The runeList at the given index.
     */
    public int getRuneList(int index) {
      return runeList_.getInt(index);
    }
    private int runeListMemoizedSerializedSize = -1;

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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      if (getRuneListList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(runeListMemoizedSerializedSize);
      }
      for (int i = 0; i < runeList_.size(); i++) {
        output.writeUInt32NoTag(runeList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < runeList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(runeList_.getInt(i));
        }
        size += dataSize;
        if (!getRuneListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        runeListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp other = (emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getRuneListList()
          .equals(other.getRuneListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getRuneListCount() > 0) {
        hash = (37 * hash) + RUNE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRuneListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Name: BDJCALIKJMN
     * CmdId: 8572
     * </pre>
     *
     * Protobuf type {@code EquipRoguelikeRuneRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EquipRoguelikeRuneRsp)
        emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.internal_static_EquipRoguelikeRuneRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.internal_static_EquipRoguelikeRuneRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp.class, emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        runeList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.internal_static_EquipRoguelikeRuneRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp build() {
        emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp buildPartial() {
        emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp result = new emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (((bitField0_ & 0x00000001) != 0)) {
          runeList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.runeList_ = runeList_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp) {
          return mergeFrom((emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp other) {
        if (other == emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.runeList_.isEmpty()) {
          if (runeList_.isEmpty()) {
            runeList_ = other.runeList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRuneListIsMutable();
            runeList_.addAll(other.runeList_);
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
        emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList runeList_ = emptyIntList();
      private void ensureRuneListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          runeList_ = mutableCopy(runeList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 rune_list = 14;</code>
       * @return A list containing the runeList.
       */
      public java.util.List<java.lang.Integer>
          getRuneListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(runeList_) : runeList_;
      }
      /**
       * <code>repeated uint32 rune_list = 14;</code>
       * @return The count of runeList.
       */
      public int getRuneListCount() {
        return runeList_.size();
      }
      /**
       * <code>repeated uint32 rune_list = 14;</code>
       * @param index The index of the element to return.
       * @return The runeList at the given index.
       */
      public int getRuneList(int index) {
        return runeList_.getInt(index);
      }
      /**
       * <code>repeated uint32 rune_list = 14;</code>
       * @param index The index to set the value at.
       * @param value The runeList to set.
       * @return This builder for chaining.
       */
      public Builder setRuneList(
          int index, int value) {
        ensureRuneListIsMutable();
        runeList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 rune_list = 14;</code>
       * @param value The runeList to add.
       * @return This builder for chaining.
       */
      public Builder addRuneList(int value) {
        ensureRuneListIsMutable();
        runeList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 rune_list = 14;</code>
       * @param values The runeList to add.
       * @return This builder for chaining.
       */
      public Builder addAllRuneList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureRuneListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, runeList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 rune_list = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRuneList() {
        runeList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:EquipRoguelikeRuneRsp)
    }

    // @@protoc_insertion_point(class_scope:EquipRoguelikeRuneRsp)
    private static final emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp();
    }

    public static emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EquipRoguelikeRuneRsp>
        PARSER = new com.google.protobuf.AbstractParser<EquipRoguelikeRuneRsp>() {
      @java.lang.Override
      public EquipRoguelikeRuneRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EquipRoguelikeRuneRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EquipRoguelikeRuneRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EquipRoguelikeRuneRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EquipRoguelikeRuneRspOuterClass.EquipRoguelikeRuneRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EquipRoguelikeRuneRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EquipRoguelikeRuneRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033EquipRoguelikeRuneRsp.proto\";\n\025EquipRo" +
      "guelikeRuneRsp\022\017\n\007retcode\030\007 \001(\005\022\021\n\trune_" +
      "list\030\016 \003(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EquipRoguelikeRuneRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EquipRoguelikeRuneRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EquipRoguelikeRuneRsp_descriptor,
        new java.lang.String[] { "Retcode", "RuneList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}