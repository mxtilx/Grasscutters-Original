// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CityReputationQuestInfo.proto

package emu.grasscutter.net.proto;

public final class CityReputationQuestInfoOuterClass {
  private CityReputationQuestInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CityReputationQuestInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CityReputationQuestInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_open = 8;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>repeated uint32 GOGAJPFNDDD = 4;</code>
     * @return A list containing the gOGAJPFNDDD.
     */
    java.util.List<java.lang.Integer> getGOGAJPFNDDDList();
    /**
     * <code>repeated uint32 GOGAJPFNDDD = 4;</code>
     * @return The count of gOGAJPFNDDD.
     */
    int getGOGAJPFNDDDCount();
    /**
     * <code>repeated uint32 GOGAJPFNDDD = 4;</code>
     * @param index The index of the element to return.
     * @return The gOGAJPFNDDD at the given index.
     */
    int getGOGAJPFNDDD(int index);

    /**
     * <code>repeated uint32 JMFHFJELJLK = 9;</code>
     * @return A list containing the jMFHFJELJLK.
     */
    java.util.List<java.lang.Integer> getJMFHFJELJLKList();
    /**
     * <code>repeated uint32 JMFHFJELJLK = 9;</code>
     * @return The count of jMFHFJELJLK.
     */
    int getJMFHFJELJLKCount();
    /**
     * <code>repeated uint32 JMFHFJELJLK = 9;</code>
     * @param index The index of the element to return.
     * @return The jMFHFJELJLK at the given index.
     */
    int getJMFHFJELJLK(int index);
  }
  /**
   * <pre>
   * Name: DBHBCEGMAHL
   * </pre>
   *
   * Protobuf type {@code CityReputationQuestInfo}
   */
  public static final class CityReputationQuestInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CityReputationQuestInfo)
      CityReputationQuestInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CityReputationQuestInfo.newBuilder() to construct.
    private CityReputationQuestInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CityReputationQuestInfo() {
      gOGAJPFNDDD_ = emptyIntList();
      jMFHFJELJLK_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CityReputationQuestInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CityReputationQuestInfo(
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
            case 32: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                gOGAJPFNDDD_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              gOGAJPFNDDD_.addInt(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                gOGAJPFNDDD_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                gOGAJPFNDDD_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 64: {

              isOpen_ = input.readBool();
              break;
            }
            case 72: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                jMFHFJELJLK_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              jMFHFJELJLK_.addInt(input.readUInt32());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                jMFHFJELJLK_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                jMFHFJELJLK_.addInt(input.readUInt32());
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
          gOGAJPFNDDD_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          jMFHFJELJLK_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.class, emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.Builder.class);
    }

    public static final int IS_OPEN_FIELD_NUMBER = 8;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 8;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int GOGAJPFNDDD_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList gOGAJPFNDDD_;
    /**
     * <code>repeated uint32 GOGAJPFNDDD = 4;</code>
     * @return A list containing the gOGAJPFNDDD.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getGOGAJPFNDDDList() {
      return gOGAJPFNDDD_;
    }
    /**
     * <code>repeated uint32 GOGAJPFNDDD = 4;</code>
     * @return The count of gOGAJPFNDDD.
     */
    public int getGOGAJPFNDDDCount() {
      return gOGAJPFNDDD_.size();
    }
    /**
     * <code>repeated uint32 GOGAJPFNDDD = 4;</code>
     * @param index The index of the element to return.
     * @return The gOGAJPFNDDD at the given index.
     */
    public int getGOGAJPFNDDD(int index) {
      return gOGAJPFNDDD_.getInt(index);
    }
    private int gOGAJPFNDDDMemoizedSerializedSize = -1;

    public static final int JMFHFJELJLK_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.IntList jMFHFJELJLK_;
    /**
     * <code>repeated uint32 JMFHFJELJLK = 9;</code>
     * @return A list containing the jMFHFJELJLK.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getJMFHFJELJLKList() {
      return jMFHFJELJLK_;
    }
    /**
     * <code>repeated uint32 JMFHFJELJLK = 9;</code>
     * @return The count of jMFHFJELJLK.
     */
    public int getJMFHFJELJLKCount() {
      return jMFHFJELJLK_.size();
    }
    /**
     * <code>repeated uint32 JMFHFJELJLK = 9;</code>
     * @param index The index of the element to return.
     * @return The jMFHFJELJLK at the given index.
     */
    public int getJMFHFJELJLK(int index) {
      return jMFHFJELJLK_.getInt(index);
    }
    private int jMFHFJELJLKMemoizedSerializedSize = -1;

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
      if (getGOGAJPFNDDDList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(gOGAJPFNDDDMemoizedSerializedSize);
      }
      for (int i = 0; i < gOGAJPFNDDD_.size(); i++) {
        output.writeUInt32NoTag(gOGAJPFNDDD_.getInt(i));
      }
      if (isOpen_ != false) {
        output.writeBool(8, isOpen_);
      }
      if (getJMFHFJELJLKList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(jMFHFJELJLKMemoizedSerializedSize);
      }
      for (int i = 0; i < jMFHFJELJLK_.size(); i++) {
        output.writeUInt32NoTag(jMFHFJELJLK_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < gOGAJPFNDDD_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(gOGAJPFNDDD_.getInt(i));
        }
        size += dataSize;
        if (!getGOGAJPFNDDDList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        gOGAJPFNDDDMemoizedSerializedSize = dataSize;
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isOpen_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < jMFHFJELJLK_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(jMFHFJELJLK_.getInt(i));
        }
        size += dataSize;
        if (!getJMFHFJELJLKList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        jMFHFJELJLKMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo other = (emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (!getGOGAJPFNDDDList()
          .equals(other.getGOGAJPFNDDDList())) return false;
      if (!getJMFHFJELJLKList()
          .equals(other.getJMFHFJELJLKList())) return false;
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
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      if (getGOGAJPFNDDDCount() > 0) {
        hash = (37 * hash) + GOGAJPFNDDD_FIELD_NUMBER;
        hash = (53 * hash) + getGOGAJPFNDDDList().hashCode();
      }
      if (getJMFHFJELJLKCount() > 0) {
        hash = (37 * hash) + JMFHFJELJLK_FIELD_NUMBER;
        hash = (53 * hash) + getJMFHFJELJLKList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo prototype) {
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
     * Name: DBHBCEGMAHL
     * </pre>
     *
     * Protobuf type {@code CityReputationQuestInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CityReputationQuestInfo)
        emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.class, emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.newBuilder()
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
        isOpen_ = false;

        gOGAJPFNDDD_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        jMFHFJELJLK_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.internal_static_CityReputationQuestInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo build() {
        emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo buildPartial() {
        emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo result = new emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo(this);
        int from_bitField0_ = bitField0_;
        result.isOpen_ = isOpen_;
        if (((bitField0_ & 0x00000001) != 0)) {
          gOGAJPFNDDD_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.gOGAJPFNDDD_ = gOGAJPFNDDD_;
        if (((bitField0_ & 0x00000002) != 0)) {
          jMFHFJELJLK_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.jMFHFJELJLK_ = jMFHFJELJLK_;
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
        if (other instanceof emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo) {
          return mergeFrom((emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo other) {
        if (other == emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (!other.gOGAJPFNDDD_.isEmpty()) {
          if (gOGAJPFNDDD_.isEmpty()) {
            gOGAJPFNDDD_ = other.gOGAJPFNDDD_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGOGAJPFNDDDIsMutable();
            gOGAJPFNDDD_.addAll(other.gOGAJPFNDDD_);
          }
          onChanged();
        }
        if (!other.jMFHFJELJLK_.isEmpty()) {
          if (jMFHFJELJLK_.isEmpty()) {
            jMFHFJELJLK_ = other.jMFHFJELJLK_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureJMFHFJELJLKIsMutable();
            jMFHFJELJLK_.addAll(other.jMFHFJELJLK_);
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
        emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 8;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 8;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList gOGAJPFNDDD_ = emptyIntList();
      private void ensureGOGAJPFNDDDIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          gOGAJPFNDDD_ = mutableCopy(gOGAJPFNDDD_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 GOGAJPFNDDD = 4;</code>
       * @return A list containing the gOGAJPFNDDD.
       */
      public java.util.List<java.lang.Integer>
          getGOGAJPFNDDDList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(gOGAJPFNDDD_) : gOGAJPFNDDD_;
      }
      /**
       * <code>repeated uint32 GOGAJPFNDDD = 4;</code>
       * @return The count of gOGAJPFNDDD.
       */
      public int getGOGAJPFNDDDCount() {
        return gOGAJPFNDDD_.size();
      }
      /**
       * <code>repeated uint32 GOGAJPFNDDD = 4;</code>
       * @param index The index of the element to return.
       * @return The gOGAJPFNDDD at the given index.
       */
      public int getGOGAJPFNDDD(int index) {
        return gOGAJPFNDDD_.getInt(index);
      }
      /**
       * <code>repeated uint32 GOGAJPFNDDD = 4;</code>
       * @param index The index to set the value at.
       * @param value The gOGAJPFNDDD to set.
       * @return This builder for chaining.
       */
      public Builder setGOGAJPFNDDD(
          int index, int value) {
        ensureGOGAJPFNDDDIsMutable();
        gOGAJPFNDDD_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 GOGAJPFNDDD = 4;</code>
       * @param value The gOGAJPFNDDD to add.
       * @return This builder for chaining.
       */
      public Builder addGOGAJPFNDDD(int value) {
        ensureGOGAJPFNDDDIsMutable();
        gOGAJPFNDDD_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 GOGAJPFNDDD = 4;</code>
       * @param values The gOGAJPFNDDD to add.
       * @return This builder for chaining.
       */
      public Builder addAllGOGAJPFNDDD(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureGOGAJPFNDDDIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, gOGAJPFNDDD_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 GOGAJPFNDDD = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGOGAJPFNDDD() {
        gOGAJPFNDDD_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList jMFHFJELJLK_ = emptyIntList();
      private void ensureJMFHFJELJLKIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          jMFHFJELJLK_ = mutableCopy(jMFHFJELJLK_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 JMFHFJELJLK = 9;</code>
       * @return A list containing the jMFHFJELJLK.
       */
      public java.util.List<java.lang.Integer>
          getJMFHFJELJLKList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(jMFHFJELJLK_) : jMFHFJELJLK_;
      }
      /**
       * <code>repeated uint32 JMFHFJELJLK = 9;</code>
       * @return The count of jMFHFJELJLK.
       */
      public int getJMFHFJELJLKCount() {
        return jMFHFJELJLK_.size();
      }
      /**
       * <code>repeated uint32 JMFHFJELJLK = 9;</code>
       * @param index The index of the element to return.
       * @return The jMFHFJELJLK at the given index.
       */
      public int getJMFHFJELJLK(int index) {
        return jMFHFJELJLK_.getInt(index);
      }
      /**
       * <code>repeated uint32 JMFHFJELJLK = 9;</code>
       * @param index The index to set the value at.
       * @param value The jMFHFJELJLK to set.
       * @return This builder for chaining.
       */
      public Builder setJMFHFJELJLK(
          int index, int value) {
        ensureJMFHFJELJLKIsMutable();
        jMFHFJELJLK_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 JMFHFJELJLK = 9;</code>
       * @param value The jMFHFJELJLK to add.
       * @return This builder for chaining.
       */
      public Builder addJMFHFJELJLK(int value) {
        ensureJMFHFJELJLKIsMutable();
        jMFHFJELJLK_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 JMFHFJELJLK = 9;</code>
       * @param values The jMFHFJELJLK to add.
       * @return This builder for chaining.
       */
      public Builder addAllJMFHFJELJLK(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureJMFHFJELJLKIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jMFHFJELJLK_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 JMFHFJELJLK = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearJMFHFJELJLK() {
        jMFHFJELJLK_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:CityReputationQuestInfo)
    }

    // @@protoc_insertion_point(class_scope:CityReputationQuestInfo)
    private static final emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo();
    }

    public static emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CityReputationQuestInfo>
        PARSER = new com.google.protobuf.AbstractParser<CityReputationQuestInfo>() {
      @java.lang.Override
      public CityReputationQuestInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CityReputationQuestInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CityReputationQuestInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CityReputationQuestInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CityReputationQuestInfoOuterClass.CityReputationQuestInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CityReputationQuestInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CityReputationQuestInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035CityReputationQuestInfo.proto\"T\n\027CityR" +
      "eputationQuestInfo\022\017\n\007is_open\030\010 \001(\010\022\023\n\013G" +
      "OGAJPFNDDD\030\004 \003(\r\022\023\n\013JMFHFJELJLK\030\t \003(\rB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CityReputationQuestInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CityReputationQuestInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CityReputationQuestInfo_descriptor,
        new java.lang.String[] { "IsOpen", "GOGAJPFNDDD", "JMFHFJELJLK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
