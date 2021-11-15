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

public final class V1Storage {
  private V1Storage() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface StorageClassOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.StorageClass)
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
     * Provisioner indicates the type of the provisioner.
     * </pre>
     *
     * <code>optional string provisioner = 2;</code>
     */
    boolean hasProvisioner();
    /**
     *
     *
     * <pre>
     * Provisioner indicates the type of the provisioner.
     * </pre>
     *
     * <code>optional string provisioner = 2;</code>
     */
    java.lang.String getProvisioner();
    /**
     *
     *
     * <pre>
     * Provisioner indicates the type of the provisioner.
     * </pre>
     *
     * <code>optional string provisioner = 2;</code>
     */
    com.google.protobuf.ByteString getProvisionerBytes();

    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    int getParametersCount();
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    boolean containsParameters(java.lang.String key);
    /** Use {@link #getParametersMap()} instead. */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.String> getParameters();
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    java.util.Map<java.lang.String, java.lang.String> getParametersMap();
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    java.lang.String getParametersOrDefault(java.lang.String key, java.lang.String defaultValue);
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    java.lang.String getParametersOrThrow(java.lang.String key);

    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with this reclaimPolicy. Defaults to Delete.
     * +optional
     * </pre>
     *
     * <code>optional string reclaimPolicy = 4;</code>
     */
    boolean hasReclaimPolicy();
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with this reclaimPolicy. Defaults to Delete.
     * +optional
     * </pre>
     *
     * <code>optional string reclaimPolicy = 4;</code>
     */
    java.lang.String getReclaimPolicy();
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with this reclaimPolicy. Defaults to Delete.
     * +optional
     * </pre>
     *
     * <code>optional string reclaimPolicy = 4;</code>
     */
    com.google.protobuf.ByteString getReclaimPolicyBytes();

    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    java.util.List<java.lang.String> getMountOptionsList();
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    int getMountOptionsCount();
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    java.lang.String getMountOptions(int index);
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    com.google.protobuf.ByteString getMountOptionsBytes(int index);

    /**
     *
     *
     * <pre>
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     * +optional
     * </pre>
     *
     * <code>optional bool allowVolumeExpansion = 6;</code>
     */
    boolean hasAllowVolumeExpansion();
    /**
     *
     *
     * <pre>
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     * +optional
     * </pre>
     *
     * <code>optional bool allowVolumeExpansion = 6;</code>
     */
    boolean getAllowVolumeExpansion();

    /**
     *
     *
     * <pre>
     * VolumeBindingMode indicates how PersistentVolumeClaims should be
     * provisioned and bound.  When unset, VolumeBindingImmediate is used.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>optional string volumeBindingMode = 7;</code>
     */
    boolean hasVolumeBindingMode();
    /**
     *
     *
     * <pre>
     * VolumeBindingMode indicates how PersistentVolumeClaims should be
     * provisioned and bound.  When unset, VolumeBindingImmediate is used.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>optional string volumeBindingMode = 7;</code>
     */
    java.lang.String getVolumeBindingMode();
    /**
     *
     *
     * <pre>
     * VolumeBindingMode indicates how PersistentVolumeClaims should be
     * provisioned and bound.  When unset, VolumeBindingImmediate is used.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>optional string volumeBindingMode = 7;</code>
     */
    com.google.protobuf.ByteString getVolumeBindingModeBytes();

    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1.TopologySelectorTerm> getAllowedTopologiesList();
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    io.kubernetes.client.proto.V1.TopologySelectorTerm getAllowedTopologies(int index);
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    int getAllowedTopologiesCount();
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder>
        getAllowedTopologiesOrBuilderList();
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder getAllowedTopologiesOrBuilder(
        int index);
  }
  /**
   *
   *
   * <pre>
   * StorageClass describes the parameters for a class of storage for
   * which PersistentVolumes can be dynamically provisioned.
   * StorageClasses are non-namespaced; the name of the storage class
   * according to etcd is in ObjectMeta.Name.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.StorageClass}
   */
  public static final class StorageClass extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.StorageClass)
      StorageClassOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use StorageClass.newBuilder() to construct.
    private StorageClass(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private StorageClass() {
      provisioner_ = "";
      reclaimPolicy_ = "";
      mountOptions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      allowVolumeExpansion_ = false;
      volumeBindingMode_ = "";
      allowedTopologies_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private StorageClass(
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
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                provisioner_ = bs;
                break;
              }
            case 26:
              {
                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                  parameters_ =
                      com.google.protobuf.MapField.newMapField(
                          ParametersDefaultEntryHolder.defaultEntry);
                  mutable_bitField0_ |= 0x00000004;
                }
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> parameters__ =
                    input.readMessage(
                        ParametersDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                parameters_.getMutableMap().put(parameters__.getKey(), parameters__.getValue());
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                reclaimPolicy_ = bs;
                break;
              }
            case 42:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                  mountOptions_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000010;
                }
                mountOptions_.add(bs);
                break;
              }
            case 48:
              {
                bitField0_ |= 0x00000008;
                allowVolumeExpansion_ = input.readBool();
                break;
              }
            case 58:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000010;
                volumeBindingMode_ = bs;
                break;
              }
            case 66:
              {
                if (!((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                  allowedTopologies_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.V1.TopologySelectorTerm>();
                  mutable_bitField0_ |= 0x00000080;
                }
                allowedTopologies_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1.TopologySelectorTerm.PARSER,
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
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          mountOptions_ = mountOptions_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
          allowedTopologies_ = java.util.Collections.unmodifiableList(allowedTopologies_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_StorageClass_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 3:
          return internalGetParameters();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_StorageClass_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.StorageClass.class,
              io.kubernetes.client.proto.V1Storage.StorageClass.Builder.class);
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

    public static final int PROVISIONER_FIELD_NUMBER = 2;
    private volatile java.lang.Object provisioner_;
    /**
     *
     *
     * <pre>
     * Provisioner indicates the type of the provisioner.
     * </pre>
     *
     * <code>optional string provisioner = 2;</code>
     */
    public boolean hasProvisioner() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Provisioner indicates the type of the provisioner.
     * </pre>
     *
     * <code>optional string provisioner = 2;</code>
     */
    public java.lang.String getProvisioner() {
      java.lang.Object ref = provisioner_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          provisioner_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Provisioner indicates the type of the provisioner.
     * </pre>
     *
     * <code>optional string provisioner = 2;</code>
     */
    public com.google.protobuf.ByteString getProvisionerBytes() {
      java.lang.Object ref = provisioner_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        provisioner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PARAMETERS_FIELD_NUMBER = 3;

    private static final class ParametersDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
          com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
              io.kubernetes.client.proto.V1Storage
                  .internal_static_k8s_io_api_storage_v1_StorageClass_ParametersEntry_descriptor,
              com.google.protobuf.WireFormat.FieldType.STRING,
              "",
              com.google.protobuf.WireFormat.FieldType.STRING,
              "");
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> parameters_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetParameters() {
      if (parameters_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ParametersDefaultEntryHolder.defaultEntry);
      }
      return parameters_;
    }

    public int getParametersCount() {
      return internalGetParameters().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    public boolean containsParameters(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetParameters().getMap().containsKey(key);
    }
    /** Use {@link #getParametersMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getParameters() {
      return getParametersMap();
    }
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    public java.util.Map<java.lang.String, java.lang.String> getParametersMap() {
      return internalGetParameters().getMap();
    }
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    public java.lang.String getParametersOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetParameters().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Parameters holds the parameters for the provisioner that should
     * create volumes of this storage class.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; parameters = 3;</code>
     */
    public java.lang.String getParametersOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetParameters().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int RECLAIMPOLICY_FIELD_NUMBER = 4;
    private volatile java.lang.Object reclaimPolicy_;
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with this reclaimPolicy. Defaults to Delete.
     * +optional
     * </pre>
     *
     * <code>optional string reclaimPolicy = 4;</code>
     */
    public boolean hasReclaimPolicy() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with this reclaimPolicy. Defaults to Delete.
     * +optional
     * </pre>
     *
     * <code>optional string reclaimPolicy = 4;</code>
     */
    public java.lang.String getReclaimPolicy() {
      java.lang.Object ref = reclaimPolicy_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          reclaimPolicy_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with this reclaimPolicy. Defaults to Delete.
     * +optional
     * </pre>
     *
     * <code>optional string reclaimPolicy = 4;</code>
     */
    public com.google.protobuf.ByteString getReclaimPolicyBytes() {
      java.lang.Object ref = reclaimPolicy_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        reclaimPolicy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MOUNTOPTIONS_FIELD_NUMBER = 5;
    private com.google.protobuf.LazyStringList mountOptions_;
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList getMountOptionsList() {
      return mountOptions_;
    }
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    public int getMountOptionsCount() {
      return mountOptions_.size();
    }
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    public java.lang.String getMountOptions(int index) {
      return mountOptions_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Dynamically provisioned PersistentVolumes of this storage class are
     * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
     * mount of the PVs will simply fail if one is invalid.
     * +optional
     * </pre>
     *
     * <code>repeated string mountOptions = 5;</code>
     */
    public com.google.protobuf.ByteString getMountOptionsBytes(int index) {
      return mountOptions_.getByteString(index);
    }

    public static final int ALLOWVOLUMEEXPANSION_FIELD_NUMBER = 6;
    private boolean allowVolumeExpansion_;
    /**
     *
     *
     * <pre>
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     * +optional
     * </pre>
     *
     * <code>optional bool allowVolumeExpansion = 6;</code>
     */
    public boolean hasAllowVolumeExpansion() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     * +optional
     * </pre>
     *
     * <code>optional bool allowVolumeExpansion = 6;</code>
     */
    public boolean getAllowVolumeExpansion() {
      return allowVolumeExpansion_;
    }

    public static final int VOLUMEBINDINGMODE_FIELD_NUMBER = 7;
    private volatile java.lang.Object volumeBindingMode_;
    /**
     *
     *
     * <pre>
     * VolumeBindingMode indicates how PersistentVolumeClaims should be
     * provisioned and bound.  When unset, VolumeBindingImmediate is used.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>optional string volumeBindingMode = 7;</code>
     */
    public boolean hasVolumeBindingMode() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * VolumeBindingMode indicates how PersistentVolumeClaims should be
     * provisioned and bound.  When unset, VolumeBindingImmediate is used.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>optional string volumeBindingMode = 7;</code>
     */
    public java.lang.String getVolumeBindingMode() {
      java.lang.Object ref = volumeBindingMode_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          volumeBindingMode_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * VolumeBindingMode indicates how PersistentVolumeClaims should be
     * provisioned and bound.  When unset, VolumeBindingImmediate is used.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>optional string volumeBindingMode = 7;</code>
     */
    public com.google.protobuf.ByteString getVolumeBindingModeBytes() {
      java.lang.Object ref = volumeBindingMode_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        volumeBindingMode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ALLOWEDTOPOLOGIES_FIELD_NUMBER = 8;
    private java.util.List<io.kubernetes.client.proto.V1.TopologySelectorTerm> allowedTopologies_;
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1.TopologySelectorTerm>
        getAllowedTopologiesList() {
      return allowedTopologies_;
    }
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder>
        getAllowedTopologiesOrBuilderList() {
      return allowedTopologies_;
    }
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    public int getAllowedTopologiesCount() {
      return allowedTopologies_.size();
    }
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    public io.kubernetes.client.proto.V1.TopologySelectorTerm getAllowedTopologies(int index) {
      return allowedTopologies_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Restrict the node topologies where volumes can be dynamically provisioned.
     * Each volume plugin defines its own supported topology specifications.
     * An empty TopologySelectorTerm list means there is no topology restriction.
     * This field is only honored by servers that enable the VolumeScheduling feature.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
     */
    public io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder
        getAllowedTopologiesOrBuilder(int index) {
      return allowedTopologies_.get(index);
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
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, provisioner_);
      }
      com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
          output, internalGetParameters(), ParametersDefaultEntryHolder.defaultEntry, 3);
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, reclaimPolicy_);
      }
      for (int i = 0; i < mountOptions_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, mountOptions_.getRaw(i));
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(6, allowVolumeExpansion_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, volumeBindingMode_);
      }
      for (int i = 0; i < allowedTopologies_.size(); i++) {
        output.writeMessage(8, allowedTopologies_.get(i));
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
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, provisioner_);
      }
      for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
          internalGetParameters().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.String> parameters__ =
            ParametersDefaultEntryHolder.defaultEntry
                .newBuilderForType()
                .setKey(entry.getKey())
                .setValue(entry.getValue())
                .build();
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, parameters__);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, reclaimPolicy_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < mountOptions_.size(); i++) {
          dataSize += computeStringSizeNoTag(mountOptions_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getMountOptionsList().size();
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(6, allowVolumeExpansion_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, volumeBindingMode_);
      }
      for (int i = 0; i < allowedTopologies_.size(); i++) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(8, allowedTopologies_.get(i));
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.StorageClass)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.StorageClass other =
          (io.kubernetes.client.proto.V1Storage.StorageClass) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasProvisioner() == other.hasProvisioner());
      if (hasProvisioner()) {
        result = result && getProvisioner().equals(other.getProvisioner());
      }
      result = result && internalGetParameters().equals(other.internalGetParameters());
      result = result && (hasReclaimPolicy() == other.hasReclaimPolicy());
      if (hasReclaimPolicy()) {
        result = result && getReclaimPolicy().equals(other.getReclaimPolicy());
      }
      result = result && getMountOptionsList().equals(other.getMountOptionsList());
      result = result && (hasAllowVolumeExpansion() == other.hasAllowVolumeExpansion());
      if (hasAllowVolumeExpansion()) {
        result = result && (getAllowVolumeExpansion() == other.getAllowVolumeExpansion());
      }
      result = result && (hasVolumeBindingMode() == other.hasVolumeBindingMode());
      if (hasVolumeBindingMode()) {
        result = result && getVolumeBindingMode().equals(other.getVolumeBindingMode());
      }
      result = result && getAllowedTopologiesList().equals(other.getAllowedTopologiesList());
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
      if (hasProvisioner()) {
        hash = (37 * hash) + PROVISIONER_FIELD_NUMBER;
        hash = (53 * hash) + getProvisioner().hashCode();
      }
      if (!internalGetParameters().getMap().isEmpty()) {
        hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
        hash = (53 * hash) + internalGetParameters().hashCode();
      }
      if (hasReclaimPolicy()) {
        hash = (37 * hash) + RECLAIMPOLICY_FIELD_NUMBER;
        hash = (53 * hash) + getReclaimPolicy().hashCode();
      }
      if (getMountOptionsCount() > 0) {
        hash = (37 * hash) + MOUNTOPTIONS_FIELD_NUMBER;
        hash = (53 * hash) + getMountOptionsList().hashCode();
      }
      if (hasAllowVolumeExpansion()) {
        hash = (37 * hash) + ALLOWVOLUMEEXPANSION_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAllowVolumeExpansion());
      }
      if (hasVolumeBindingMode()) {
        hash = (37 * hash) + VOLUMEBINDINGMODE_FIELD_NUMBER;
        hash = (53 * hash) + getVolumeBindingMode().hashCode();
      }
      if (getAllowedTopologiesCount() > 0) {
        hash = (37 * hash) + ALLOWEDTOPOLOGIES_FIELD_NUMBER;
        hash = (53 * hash) + getAllowedTopologiesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass parseFrom(
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

    public static Builder newBuilder(io.kubernetes.client.proto.V1Storage.StorageClass prototype) {
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
     * StorageClass describes the parameters for a class of storage for
     * which PersistentVolumes can be dynamically provisioned.
     * StorageClasses are non-namespaced; the name of the storage class
     * according to etcd is in ObjectMeta.Name.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.StorageClass}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.StorageClass)
        io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_StorageClass_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(int number) {
        switch (number) {
          case 3:
            return internalGetParameters();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
        switch (number) {
          case 3:
            return internalGetMutableParameters();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_StorageClass_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.StorageClass.class,
                io.kubernetes.client.proto.V1Storage.StorageClass.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.StorageClass.newBuilder()
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
          getAllowedTopologiesFieldBuilder();
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
        provisioner_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        internalGetMutableParameters().clear();
        reclaimPolicy_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        mountOptions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        allowVolumeExpansion_ = false;
        bitField0_ = (bitField0_ & ~0x00000020);
        volumeBindingMode_ = "";
        bitField0_ = (bitField0_ & ~0x00000040);
        if (allowedTopologiesBuilder_ == null) {
          allowedTopologies_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
        } else {
          allowedTopologiesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_StorageClass_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.StorageClass getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.StorageClass.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.StorageClass build() {
        io.kubernetes.client.proto.V1Storage.StorageClass result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.StorageClass buildPartial() {
        io.kubernetes.client.proto.V1Storage.StorageClass result =
            new io.kubernetes.client.proto.V1Storage.StorageClass(this);
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
        result.provisioner_ = provisioner_;
        result.parameters_ = internalGetParameters();
        result.parameters_.makeImmutable();
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.reclaimPolicy_ = reclaimPolicy_;
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          mountOptions_ = mountOptions_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.mountOptions_ = mountOptions_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000008;
        }
        result.allowVolumeExpansion_ = allowVolumeExpansion_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000010;
        }
        result.volumeBindingMode_ = volumeBindingMode_;
        if (allowedTopologiesBuilder_ == null) {
          if (((bitField0_ & 0x00000080) == 0x00000080)) {
            allowedTopologies_ = java.util.Collections.unmodifiableList(allowedTopologies_);
            bitField0_ = (bitField0_ & ~0x00000080);
          }
          result.allowedTopologies_ = allowedTopologies_;
        } else {
          result.allowedTopologies_ = allowedTopologiesBuilder_.build();
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
        if (other instanceof io.kubernetes.client.proto.V1Storage.StorageClass) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.StorageClass) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.StorageClass other) {
        if (other == io.kubernetes.client.proto.V1Storage.StorageClass.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasProvisioner()) {
          bitField0_ |= 0x00000002;
          provisioner_ = other.provisioner_;
          onChanged();
        }
        internalGetMutableParameters().mergeFrom(other.internalGetParameters());
        if (other.hasReclaimPolicy()) {
          bitField0_ |= 0x00000008;
          reclaimPolicy_ = other.reclaimPolicy_;
          onChanged();
        }
        if (!other.mountOptions_.isEmpty()) {
          if (mountOptions_.isEmpty()) {
            mountOptions_ = other.mountOptions_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureMountOptionsIsMutable();
            mountOptions_.addAll(other.mountOptions_);
          }
          onChanged();
        }
        if (other.hasAllowVolumeExpansion()) {
          setAllowVolumeExpansion(other.getAllowVolumeExpansion());
        }
        if (other.hasVolumeBindingMode()) {
          bitField0_ |= 0x00000040;
          volumeBindingMode_ = other.volumeBindingMode_;
          onChanged();
        }
        if (allowedTopologiesBuilder_ == null) {
          if (!other.allowedTopologies_.isEmpty()) {
            if (allowedTopologies_.isEmpty()) {
              allowedTopologies_ = other.allowedTopologies_;
              bitField0_ = (bitField0_ & ~0x00000080);
            } else {
              ensureAllowedTopologiesIsMutable();
              allowedTopologies_.addAll(other.allowedTopologies_);
            }
            onChanged();
          }
        } else {
          if (!other.allowedTopologies_.isEmpty()) {
            if (allowedTopologiesBuilder_.isEmpty()) {
              allowedTopologiesBuilder_.dispose();
              allowedTopologiesBuilder_ = null;
              allowedTopologies_ = other.allowedTopologies_;
              bitField0_ = (bitField0_ & ~0x00000080);
              allowedTopologiesBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getAllowedTopologiesFieldBuilder()
                      : null;
            } else {
              allowedTopologiesBuilder_.addAllMessages(other.allowedTopologies_);
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
        io.kubernetes.client.proto.V1Storage.StorageClass parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.StorageClass) e.getUnfinishedMessage();
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

      private java.lang.Object provisioner_ = "";
      /**
       *
       *
       * <pre>
       * Provisioner indicates the type of the provisioner.
       * </pre>
       *
       * <code>optional string provisioner = 2;</code>
       */
      public boolean hasProvisioner() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Provisioner indicates the type of the provisioner.
       * </pre>
       *
       * <code>optional string provisioner = 2;</code>
       */
      public java.lang.String getProvisioner() {
        java.lang.Object ref = provisioner_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            provisioner_ = s;
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
       * Provisioner indicates the type of the provisioner.
       * </pre>
       *
       * <code>optional string provisioner = 2;</code>
       */
      public com.google.protobuf.ByteString getProvisionerBytes() {
        java.lang.Object ref = provisioner_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          provisioner_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Provisioner indicates the type of the provisioner.
       * </pre>
       *
       * <code>optional string provisioner = 2;</code>
       */
      public Builder setProvisioner(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        provisioner_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Provisioner indicates the type of the provisioner.
       * </pre>
       *
       * <code>optional string provisioner = 2;</code>
       */
      public Builder clearProvisioner() {
        bitField0_ = (bitField0_ & ~0x00000002);
        provisioner_ = getDefaultInstance().getProvisioner();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Provisioner indicates the type of the provisioner.
       * </pre>
       *
       * <code>optional string provisioner = 2;</code>
       */
      public Builder setProvisionerBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        provisioner_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<java.lang.String, java.lang.String> parameters_;

      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
          internalGetParameters() {
        if (parameters_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              ParametersDefaultEntryHolder.defaultEntry);
        }
        return parameters_;
      }

      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
          internalGetMutableParameters() {
        onChanged();
        ;
        if (parameters_ == null) {
          parameters_ =
              com.google.protobuf.MapField.newMapField(ParametersDefaultEntryHolder.defaultEntry);
        }
        if (!parameters_.isMutable()) {
          parameters_ = parameters_.copy();
        }
        return parameters_;
      }

      public int getParametersCount() {
        return internalGetParameters().getMap().size();
      }
      /**
       *
       *
       * <pre>
       * Parameters holds the parameters for the provisioner that should
       * create volumes of this storage class.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; parameters = 3;</code>
       */
      public boolean containsParameters(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        return internalGetParameters().getMap().containsKey(key);
      }
      /** Use {@link #getParametersMap()} instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return getParametersMap();
      }
      /**
       *
       *
       * <pre>
       * Parameters holds the parameters for the provisioner that should
       * create volumes of this storage class.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; parameters = 3;</code>
       */
      public java.util.Map<java.lang.String, java.lang.String> getParametersMap() {
        return internalGetParameters().getMap();
      }
      /**
       *
       *
       * <pre>
       * Parameters holds the parameters for the provisioner that should
       * create volumes of this storage class.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; parameters = 3;</code>
       */
      public java.lang.String getParametersOrDefault(
          java.lang.String key, java.lang.String defaultValue) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, java.lang.String> map = internalGetParameters().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       *
       *
       * <pre>
       * Parameters holds the parameters for the provisioner that should
       * create volumes of this storage class.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; parameters = 3;</code>
       */
      public java.lang.String getParametersOrThrow(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, java.lang.String> map = internalGetParameters().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearParameters() {
        internalGetMutableParameters().getMutableMap().clear();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Parameters holds the parameters for the provisioner that should
       * create volumes of this storage class.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; parameters = 3;</code>
       */
      public Builder removeParameters(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableParameters().getMutableMap().remove(key);
        return this;
      }
      /** Use alternate mutation accessors instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getMutableParameters() {
        return internalGetMutableParameters().getMutableMap();
      }
      /**
       *
       *
       * <pre>
       * Parameters holds the parameters for the provisioner that should
       * create volumes of this storage class.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; parameters = 3;</code>
       */
      public Builder putParameters(java.lang.String key, java.lang.String value) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        if (value == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableParameters().getMutableMap().put(key, value);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Parameters holds the parameters for the provisioner that should
       * create volumes of this storage class.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; parameters = 3;</code>
       */
      public Builder putAllParameters(java.util.Map<java.lang.String, java.lang.String> values) {
        internalGetMutableParameters().getMutableMap().putAll(values);
        return this;
      }

      private java.lang.Object reclaimPolicy_ = "";
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with this reclaimPolicy. Defaults to Delete.
       * +optional
       * </pre>
       *
       * <code>optional string reclaimPolicy = 4;</code>
       */
      public boolean hasReclaimPolicy() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with this reclaimPolicy. Defaults to Delete.
       * +optional
       * </pre>
       *
       * <code>optional string reclaimPolicy = 4;</code>
       */
      public java.lang.String getReclaimPolicy() {
        java.lang.Object ref = reclaimPolicy_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            reclaimPolicy_ = s;
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
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with this reclaimPolicy. Defaults to Delete.
       * +optional
       * </pre>
       *
       * <code>optional string reclaimPolicy = 4;</code>
       */
      public com.google.protobuf.ByteString getReclaimPolicyBytes() {
        java.lang.Object ref = reclaimPolicy_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          reclaimPolicy_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with this reclaimPolicy. Defaults to Delete.
       * +optional
       * </pre>
       *
       * <code>optional string reclaimPolicy = 4;</code>
       */
      public Builder setReclaimPolicy(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        reclaimPolicy_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with this reclaimPolicy. Defaults to Delete.
       * +optional
       * </pre>
       *
       * <code>optional string reclaimPolicy = 4;</code>
       */
      public Builder clearReclaimPolicy() {
        bitField0_ = (bitField0_ & ~0x00000008);
        reclaimPolicy_ = getDefaultInstance().getReclaimPolicy();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with this reclaimPolicy. Defaults to Delete.
       * +optional
       * </pre>
       *
       * <code>optional string reclaimPolicy = 4;</code>
       */
      public Builder setReclaimPolicyBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        reclaimPolicy_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList mountOptions_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureMountOptionsIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          mountOptions_ = new com.google.protobuf.LazyStringArrayList(mountOptions_);
          bitField0_ |= 0x00000010;
        }
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public com.google.protobuf.ProtocolStringList getMountOptionsList() {
        return mountOptions_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public int getMountOptionsCount() {
        return mountOptions_.size();
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public java.lang.String getMountOptions(int index) {
        return mountOptions_.get(index);
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public com.google.protobuf.ByteString getMountOptionsBytes(int index) {
        return mountOptions_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public Builder setMountOptions(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMountOptionsIsMutable();
        mountOptions_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public Builder addMountOptions(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMountOptionsIsMutable();
        mountOptions_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public Builder addAllMountOptions(java.lang.Iterable<java.lang.String> values) {
        ensureMountOptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, mountOptions_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public Builder clearMountOptions() {
        mountOptions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Dynamically provisioned PersistentVolumes of this storage class are
       * created with these mountOptions, e.g. ["ro", "soft"]. Not validated -
       * mount of the PVs will simply fail if one is invalid.
       * +optional
       * </pre>
       *
       * <code>repeated string mountOptions = 5;</code>
       */
      public Builder addMountOptionsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMountOptionsIsMutable();
        mountOptions_.add(value);
        onChanged();
        return this;
      }

      private boolean allowVolumeExpansion_;
      /**
       *
       *
       * <pre>
       * AllowVolumeExpansion shows whether the storage class allow volume expand
       * +optional
       * </pre>
       *
       * <code>optional bool allowVolumeExpansion = 6;</code>
       */
      public boolean hasAllowVolumeExpansion() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       *
       *
       * <pre>
       * AllowVolumeExpansion shows whether the storage class allow volume expand
       * +optional
       * </pre>
       *
       * <code>optional bool allowVolumeExpansion = 6;</code>
       */
      public boolean getAllowVolumeExpansion() {
        return allowVolumeExpansion_;
      }
      /**
       *
       *
       * <pre>
       * AllowVolumeExpansion shows whether the storage class allow volume expand
       * +optional
       * </pre>
       *
       * <code>optional bool allowVolumeExpansion = 6;</code>
       */
      public Builder setAllowVolumeExpansion(boolean value) {
        bitField0_ |= 0x00000020;
        allowVolumeExpansion_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * AllowVolumeExpansion shows whether the storage class allow volume expand
       * +optional
       * </pre>
       *
       * <code>optional bool allowVolumeExpansion = 6;</code>
       */
      public Builder clearAllowVolumeExpansion() {
        bitField0_ = (bitField0_ & ~0x00000020);
        allowVolumeExpansion_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object volumeBindingMode_ = "";
      /**
       *
       *
       * <pre>
       * VolumeBindingMode indicates how PersistentVolumeClaims should be
       * provisioned and bound.  When unset, VolumeBindingImmediate is used.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>optional string volumeBindingMode = 7;</code>
       */
      public boolean hasVolumeBindingMode() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       *
       *
       * <pre>
       * VolumeBindingMode indicates how PersistentVolumeClaims should be
       * provisioned and bound.  When unset, VolumeBindingImmediate is used.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>optional string volumeBindingMode = 7;</code>
       */
      public java.lang.String getVolumeBindingMode() {
        java.lang.Object ref = volumeBindingMode_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            volumeBindingMode_ = s;
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
       * VolumeBindingMode indicates how PersistentVolumeClaims should be
       * provisioned and bound.  When unset, VolumeBindingImmediate is used.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>optional string volumeBindingMode = 7;</code>
       */
      public com.google.protobuf.ByteString getVolumeBindingModeBytes() {
        java.lang.Object ref = volumeBindingMode_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          volumeBindingMode_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * VolumeBindingMode indicates how PersistentVolumeClaims should be
       * provisioned and bound.  When unset, VolumeBindingImmediate is used.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>optional string volumeBindingMode = 7;</code>
       */
      public Builder setVolumeBindingMode(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000040;
        volumeBindingMode_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * VolumeBindingMode indicates how PersistentVolumeClaims should be
       * provisioned and bound.  When unset, VolumeBindingImmediate is used.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>optional string volumeBindingMode = 7;</code>
       */
      public Builder clearVolumeBindingMode() {
        bitField0_ = (bitField0_ & ~0x00000040);
        volumeBindingMode_ = getDefaultInstance().getVolumeBindingMode();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * VolumeBindingMode indicates how PersistentVolumeClaims should be
       * provisioned and bound.  When unset, VolumeBindingImmediate is used.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>optional string volumeBindingMode = 7;</code>
       */
      public Builder setVolumeBindingModeBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000040;
        volumeBindingMode_ = value;
        onChanged();
        return this;
      }

      private java.util.List<io.kubernetes.client.proto.V1.TopologySelectorTerm>
          allowedTopologies_ = java.util.Collections.emptyList();

      private void ensureAllowedTopologiesIsMutable() {
        if (!((bitField0_ & 0x00000080) == 0x00000080)) {
          allowedTopologies_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1.TopologySelectorTerm>(
                  allowedTopologies_);
          bitField0_ |= 0x00000080;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1.TopologySelectorTerm,
              io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder,
              io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder>
          allowedTopologiesBuilder_;

      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1.TopologySelectorTerm>
          getAllowedTopologiesList() {
        if (allowedTopologiesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(allowedTopologies_);
        } else {
          return allowedTopologiesBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public int getAllowedTopologiesCount() {
        if (allowedTopologiesBuilder_ == null) {
          return allowedTopologies_.size();
        } else {
          return allowedTopologiesBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public io.kubernetes.client.proto.V1.TopologySelectorTerm getAllowedTopologies(int index) {
        if (allowedTopologiesBuilder_ == null) {
          return allowedTopologies_.get(index);
        } else {
          return allowedTopologiesBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder setAllowedTopologies(
          int index, io.kubernetes.client.proto.V1.TopologySelectorTerm value) {
        if (allowedTopologiesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowedTopologiesIsMutable();
          allowedTopologies_.set(index, value);
          onChanged();
        } else {
          allowedTopologiesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder setAllowedTopologies(
          int index, io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder builderForValue) {
        if (allowedTopologiesBuilder_ == null) {
          ensureAllowedTopologiesIsMutable();
          allowedTopologies_.set(index, builderForValue.build());
          onChanged();
        } else {
          allowedTopologiesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder addAllowedTopologies(
          io.kubernetes.client.proto.V1.TopologySelectorTerm value) {
        if (allowedTopologiesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowedTopologiesIsMutable();
          allowedTopologies_.add(value);
          onChanged();
        } else {
          allowedTopologiesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder addAllowedTopologies(
          int index, io.kubernetes.client.proto.V1.TopologySelectorTerm value) {
        if (allowedTopologiesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAllowedTopologiesIsMutable();
          allowedTopologies_.add(index, value);
          onChanged();
        } else {
          allowedTopologiesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder addAllowedTopologies(
          io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder builderForValue) {
        if (allowedTopologiesBuilder_ == null) {
          ensureAllowedTopologiesIsMutable();
          allowedTopologies_.add(builderForValue.build());
          onChanged();
        } else {
          allowedTopologiesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder addAllowedTopologies(
          int index, io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder builderForValue) {
        if (allowedTopologiesBuilder_ == null) {
          ensureAllowedTopologiesIsMutable();
          allowedTopologies_.add(index, builderForValue.build());
          onChanged();
        } else {
          allowedTopologiesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder addAllAllowedTopologies(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1.TopologySelectorTerm> values) {
        if (allowedTopologiesBuilder_ == null) {
          ensureAllowedTopologiesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, allowedTopologies_);
          onChanged();
        } else {
          allowedTopologiesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder clearAllowedTopologies() {
        if (allowedTopologiesBuilder_ == null) {
          allowedTopologies_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
          onChanged();
        } else {
          allowedTopologiesBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public Builder removeAllowedTopologies(int index) {
        if (allowedTopologiesBuilder_ == null) {
          ensureAllowedTopologiesIsMutable();
          allowedTopologies_.remove(index);
          onChanged();
        } else {
          allowedTopologiesBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder getAllowedTopologiesBuilder(
          int index) {
        return getAllowedTopologiesFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder
          getAllowedTopologiesOrBuilder(int index) {
        if (allowedTopologiesBuilder_ == null) {
          return allowedTopologies_.get(index);
        } else {
          return allowedTopologiesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder>
          getAllowedTopologiesOrBuilderList() {
        if (allowedTopologiesBuilder_ != null) {
          return allowedTopologiesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(allowedTopologies_);
        }
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder
          addAllowedTopologiesBuilder() {
        return getAllowedTopologiesFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1.TopologySelectorTerm.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder addAllowedTopologiesBuilder(
          int index) {
        return getAllowedTopologiesFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1.TopologySelectorTerm.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Restrict the node topologies where volumes can be dynamically provisioned.
       * Each volume plugin defines its own supported topology specifications.
       * An empty TopologySelectorTerm list means there is no topology restriction.
       * This field is only honored by servers that enable the VolumeScheduling feature.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.TopologySelectorTerm allowedTopologies = 8;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder>
          getAllowedTopologiesBuilderList() {
        return getAllowedTopologiesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1.TopologySelectorTerm,
              io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder,
              io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder>
          getAllowedTopologiesFieldBuilder() {
        if (allowedTopologiesBuilder_ == null) {
          allowedTopologiesBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1.TopologySelectorTerm,
                  io.kubernetes.client.proto.V1.TopologySelectorTerm.Builder,
                  io.kubernetes.client.proto.V1.TopologySelectorTermOrBuilder>(
                  allowedTopologies_,
                  ((bitField0_ & 0x00000080) == 0x00000080),
                  getParentForChildren(),
                  isClean());
          allowedTopologies_ = null;
        }
        return allowedTopologiesBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.StorageClass)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.StorageClass)
    private static final io.kubernetes.client.proto.V1Storage.StorageClass DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.StorageClass();
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClass getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<StorageClass> PARSER =
        new com.google.protobuf.AbstractParser<StorageClass>() {
          @java.lang.Override
          public StorageClass parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new StorageClass(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<StorageClass> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StorageClass> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.StorageClass getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface StorageClassListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.StorageClassList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard list metadata
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
     * Standard list metadata
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
     * Standard list metadata
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
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Storage.StorageClass> getItemsList();
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.StorageClass getItems(int index);
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * StorageClassList is a collection of storage classes.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.StorageClassList}
   */
  public static final class StorageClassList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.StorageClassList)
      StorageClassListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use StorageClassList.newBuilder() to construct.
    private StorageClassList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private StorageClassList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private StorageClassList(
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
                      new java.util.ArrayList<io.kubernetes.client.proto.V1Storage.StorageClass>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.StorageClass.PARSER,
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
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_StorageClassList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_StorageClassList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.StorageClassList.class,
              io.kubernetes.client.proto.V1Storage.StorageClassList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard list metadata
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
     * Standard list metadata
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
     * Standard list metadata
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
    private java.util.List<io.kubernetes.client.proto.V1Storage.StorageClass> items_;
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Storage.StorageClass> getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.StorageClass getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Items is the list of StorageClasses
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder getItemsOrBuilder(int index) {
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.StorageClassList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.StorageClassList other =
          (io.kubernetes.client.proto.V1Storage.StorageClassList) obj;

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

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList parseFrom(
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
        io.kubernetes.client.proto.V1Storage.StorageClassList prototype) {
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
     * StorageClassList is a collection of storage classes.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.StorageClassList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.StorageClassList)
        io.kubernetes.client.proto.V1Storage.StorageClassListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_StorageClassList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_StorageClassList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.StorageClassList.class,
                io.kubernetes.client.proto.V1Storage.StorageClassList.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.StorageClassList.newBuilder()
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
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_StorageClassList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.StorageClassList getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.StorageClassList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.StorageClassList build() {
        io.kubernetes.client.proto.V1Storage.StorageClassList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.StorageClassList buildPartial() {
        io.kubernetes.client.proto.V1Storage.StorageClassList result =
            new io.kubernetes.client.proto.V1Storage.StorageClassList(this);
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
        if (other instanceof io.kubernetes.client.proto.V1Storage.StorageClassList) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.StorageClassList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.StorageClassList other) {
        if (other == io.kubernetes.client.proto.V1Storage.StorageClassList.getDefaultInstance())
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
        io.kubernetes.client.proto.V1Storage.StorageClassList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.StorageClassList) e.getUnfinishedMessage();
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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

      private java.util.List<io.kubernetes.client.proto.V1Storage.StorageClass> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1Storage.StorageClass>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.StorageClass,
              io.kubernetes.client.proto.V1Storage.StorageClass.Builder,
              io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.StorageClass> getItemsList() {
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
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
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
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.StorageClass getItems(int index) {
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
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder setItems(int index, io.kubernetes.client.proto.V1Storage.StorageClass value) {
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
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1Storage.StorageClass.Builder builderForValue) {
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
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1Storage.StorageClass value) {
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
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder addItems(int index, io.kubernetes.client.proto.V1Storage.StorageClass value) {
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
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1Storage.StorageClass.Builder builderForValue) {
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
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1Storage.StorageClass.Builder builderForValue) {
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
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Storage.StorageClass> values) {
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
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
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
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
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
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.StorageClass.Builder getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder getItemsOrBuilder(
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
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder>
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
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.StorageClass.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Storage.StorageClass.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.StorageClass.Builder addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1Storage.StorageClass.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is the list of StorageClasses
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.StorageClass items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.StorageClass.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.StorageClass,
              io.kubernetes.client.proto.V1Storage.StorageClass.Builder,
              io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.StorageClass,
                  io.kubernetes.client.proto.V1Storage.StorageClass.Builder,
                  io.kubernetes.client.proto.V1Storage.StorageClassOrBuilder>(
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.StorageClassList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.StorageClassList)
    private static final io.kubernetes.client.proto.V1Storage.StorageClassList DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.StorageClassList();
    }

    public static io.kubernetes.client.proto.V1Storage.StorageClassList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<StorageClassList> PARSER =
        new com.google.protobuf.AbstractParser<StorageClassList>() {
          @java.lang.Override
          public StorageClassList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new StorageClassList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<StorageClassList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StorageClassList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.StorageClassList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface VolumeAttachmentOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.VolumeAttachment)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object metadata.
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
     * Standard object metadata.
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
     * Standard object metadata.
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
     * Specification of the desired attach/detach volume behavior.
     * Populated by the Kubernetes system.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired attach/detach volume behavior.
     * Populated by the Kubernetes system.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec getSpec();
    /**
     *
     *
     * <pre>
     * Specification of the desired attach/detach volume behavior.
     * Populated by the Kubernetes system.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpecOrBuilder getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * Status of the VolumeAttachment request.
     * Populated by the entity completing the attach or detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * Status of the VolumeAttachment request.
     * Populated by the entity completing the attach or detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus getStatus();
    /**
     *
     *
     * <pre>
     * Status of the VolumeAttachment request.
     * Populated by the entity completing the attach or detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatusOrBuilder getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * VolumeAttachment captures the intent to attach or detach the specified volume
   * to/from the specified node.
   * VolumeAttachment objects are non-namespaced.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachment}
   */
  public static final class VolumeAttachment extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.VolumeAttachment)
      VolumeAttachmentOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use VolumeAttachment.newBuilder() to construct.
    private VolumeAttachment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private VolumeAttachment() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private VolumeAttachment(
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
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(status_);
                  status_ = subBuilder.buildPartial();
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
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.VolumeAttachment.class,
              io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object metadata.
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
     * Standard object metadata.
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
     * Standard object metadata.
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
    private io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec spec_;
    /**
     *
     *
     * <pre>
     * Specification of the desired attach/detach volume behavior.
     * Populated by the Kubernetes system.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired attach/detach volume behavior.
     * Populated by the Kubernetes system.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * Specification of the desired attach/detach volume behavior.
     * Populated by the Kubernetes system.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpecOrBuilder getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus status_;
    /**
     *
     *
     * <pre>
     * Status of the VolumeAttachment request.
     * Populated by the entity completing the attach or detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Status of the VolumeAttachment request.
     * Populated by the entity completing the attach or detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * Status of the VolumeAttachment request.
     * Populated by the entity completing the attach or detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatusOrBuilder
        getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.getDefaultInstance()
          : status_;
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
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getStatus());
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
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStatus());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachment)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.VolumeAttachment other =
          (io.kubernetes.client.proto.V1Storage.VolumeAttachment) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
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
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment parseFrom(
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
        io.kubernetes.client.proto.V1Storage.VolumeAttachment prototype) {
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
     * VolumeAttachment captures the intent to attach or detach the specified volume
     * to/from the specified node.
     * VolumeAttachment objects are non-namespaced.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachment}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.VolumeAttachment)
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachment_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachment_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.VolumeAttachment.class,
                io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.VolumeAttachment.newBuilder()
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
          getStatusFieldBuilder();
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
        if (statusBuilder_ == null) {
          status_ = null;
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachment_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachment getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.VolumeAttachment.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachment build() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachment result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachment buildPartial() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachment result =
            new io.kubernetes.client.proto.V1Storage.VolumeAttachment(this);
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
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (statusBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
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
        if (other instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachment) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.VolumeAttachment) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.VolumeAttachment other) {
        if (other == io.kubernetes.client.proto.V1Storage.VolumeAttachment.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
        }
        if (other.hasStatus()) {
          mergeStatus(other.getStatus());
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
        io.kubernetes.client.proto.V1Storage.VolumeAttachment parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.VolumeAttachment) e.getUnfinishedMessage();
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
       * Standard object metadata.
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
       * Standard object metadata.
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
       * Standard object metadata.
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
       * Standard object metadata.
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
       * Standard object metadata.
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
       * Standard object metadata.
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
       * Standard object metadata.
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
       * Standard object metadata.
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
       * Standard object metadata.
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

      private io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      public Builder setSpec(io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec value) {
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
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder builderForValue) {
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
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      public Builder mergeSpec(io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.newBuilder(spec_)
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
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
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
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpecOrBuilder getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * Specification of the desired attach/detach volume behavior.
       * Populated by the Kubernetes system.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSpec spec = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus status_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public Builder setStatus(io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          status_ = value;
          onChanged();
        } else {
          statusBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder builderForValue) {
        if (statusBuilder_ == null) {
          status_ = builderForValue.build();
          onChanged();
        } else {
          statusBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public Builder mergeStatus(
          io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_
                  != io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus
                      .getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.newBuilder(status_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            status_ = value;
          }
          onChanged();
        } else {
          statusBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = null;
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder
          getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatusOrBuilder
          getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * Status of the VolumeAttachment request.
       * Populated by the entity completing the attach or detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentStatus status = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatusOrBuilder>(
                  getStatus(), getParentForChildren(), isClean());
          status_ = null;
        }
        return statusBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.VolumeAttachment)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.VolumeAttachment)
    private static final io.kubernetes.client.proto.V1Storage.VolumeAttachment DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.VolumeAttachment();
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachment getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<VolumeAttachment> PARSER =
        new com.google.protobuf.AbstractParser<VolumeAttachment>() {
          @java.lang.Override
          public VolumeAttachment parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new VolumeAttachment(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<VolumeAttachment> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VolumeAttachment> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.VolumeAttachment getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface VolumeAttachmentListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.VolumeAttachmentList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard list metadata
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
     * Standard list metadata
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
     * Standard list metadata
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
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Storage.VolumeAttachment> getItemsList();
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachment getItems(int index);
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * VolumeAttachmentList is a collection of VolumeAttachment objects.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentList}
   */
  public static final class VolumeAttachmentList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.VolumeAttachmentList)
      VolumeAttachmentListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use VolumeAttachmentList.newBuilder() to construct.
    private VolumeAttachmentList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private VolumeAttachmentList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private VolumeAttachmentList(
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
                          io.kubernetes.client.proto.V1Storage.VolumeAttachment>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.VolumeAttachment.PARSER,
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
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentList.class,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard list metadata
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
     * Standard list metadata
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
     * Standard list metadata
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
    private java.util.List<io.kubernetes.client.proto.V1Storage.VolumeAttachment> items_;
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Storage.VolumeAttachment> getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachment getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Items is the list of VolumeAttachments
     * </pre>
     *
     * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder getItemsOrBuilder(
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.VolumeAttachmentList other =
          (io.kubernetes.client.proto.V1Storage.VolumeAttachmentList) obj;

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

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parseFrom(
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
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentList prototype) {
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
     * VolumeAttachmentList is a collection of VolumeAttachment objects.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.VolumeAttachmentList)
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentList.class,
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentList.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1Storage.VolumeAttachmentList.newBuilder()
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
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentList getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.VolumeAttachmentList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentList build() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentList buildPartial() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentList result =
            new io.kubernetes.client.proto.V1Storage.VolumeAttachmentList(this);
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
        if (other instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentList) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.VolumeAttachmentList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.VolumeAttachmentList other) {
        if (other == io.kubernetes.client.proto.V1Storage.VolumeAttachmentList.getDefaultInstance())
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
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.VolumeAttachmentList) e.getUnfinishedMessage();
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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
       * Standard list metadata
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

      private java.util.List<io.kubernetes.client.proto.V1Storage.VolumeAttachment> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1Storage.VolumeAttachment>(
                  items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachment,
              io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.VolumeAttachment> getItemsList() {
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
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
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
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachment getItems(int index) {
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
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1Storage.VolumeAttachment value) {
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
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder builderForValue) {
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
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1Storage.VolumeAttachment value) {
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
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1Storage.VolumeAttachment value) {
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
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder builderForValue) {
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
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder builderForValue) {
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
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Storage.VolumeAttachment>
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
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
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
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
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
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder getItemsBuilder(
          int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder getItemsOrBuilder(
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
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder>
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
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Storage.VolumeAttachment.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder addItemsBuilder(
          int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1Storage.VolumeAttachment.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is the list of VolumeAttachments
       * </pre>
       *
       * <code>repeated .k8s.io.api.storage.v1.VolumeAttachment items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachment,
              io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.VolumeAttachment,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachment.Builder,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentOrBuilder>(
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.VolumeAttachmentList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.VolumeAttachmentList)
    private static final io.kubernetes.client.proto.V1Storage.VolumeAttachmentList DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.VolumeAttachmentList();
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<VolumeAttachmentList> PARSER =
        new com.google.protobuf.AbstractParser<VolumeAttachmentList>() {
          @java.lang.Override
          public VolumeAttachmentList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new VolumeAttachmentList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<VolumeAttachmentList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VolumeAttachmentList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface VolumeAttachmentSourceOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.VolumeAttachmentSource)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Name of the persistent volume to attach.
     * +optional
     * </pre>
     *
     * <code>optional string persistentVolumeName = 1;</code>
     */
    boolean hasPersistentVolumeName();
    /**
     *
     *
     * <pre>
     * Name of the persistent volume to attach.
     * +optional
     * </pre>
     *
     * <code>optional string persistentVolumeName = 1;</code>
     */
    java.lang.String getPersistentVolumeName();
    /**
     *
     *
     * <pre>
     * Name of the persistent volume to attach.
     * +optional
     * </pre>
     *
     * <code>optional string persistentVolumeName = 1;</code>
     */
    com.google.protobuf.ByteString getPersistentVolumeNameBytes();
  }
  /**
   *
   *
   * <pre>
   * VolumeAttachmentSource represents a volume that should be attached.
   * Right now only PersistenVolumes can be attached via external attacher,
   * in future we may allow also inline volumes in pods.
   * Exactly one member can be set.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentSource}
   */
  public static final class VolumeAttachmentSource extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.VolumeAttachmentSource)
      VolumeAttachmentSourceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use VolumeAttachmentSource.newBuilder() to construct.
    private VolumeAttachmentSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private VolumeAttachmentSource() {
      persistentVolumeName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private VolumeAttachmentSource(
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
                persistentVolumeName_ = bs;
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
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.class,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder.class);
    }

    private int bitField0_;
    public static final int PERSISTENTVOLUMENAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object persistentVolumeName_;
    /**
     *
     *
     * <pre>
     * Name of the persistent volume to attach.
     * +optional
     * </pre>
     *
     * <code>optional string persistentVolumeName = 1;</code>
     */
    public boolean hasPersistentVolumeName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Name of the persistent volume to attach.
     * +optional
     * </pre>
     *
     * <code>optional string persistentVolumeName = 1;</code>
     */
    public java.lang.String getPersistentVolumeName() {
      java.lang.Object ref = persistentVolumeName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          persistentVolumeName_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the persistent volume to attach.
     * +optional
     * </pre>
     *
     * <code>optional string persistentVolumeName = 1;</code>
     */
    public com.google.protobuf.ByteString getPersistentVolumeNameBytes() {
      java.lang.Object ref = persistentVolumeName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        persistentVolumeName_ = b;
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, persistentVolumeName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, persistentVolumeName_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource other =
          (io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource) obj;

      boolean result = true;
      result = result && (hasPersistentVolumeName() == other.hasPersistentVolumeName());
      if (hasPersistentVolumeName()) {
        result = result && getPersistentVolumeName().equals(other.getPersistentVolumeName());
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
      if (hasPersistentVolumeName()) {
        hash = (37 * hash) + PERSISTENTVOLUMENAME_FIELD_NUMBER;
        hash = (53 * hash) + getPersistentVolumeName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parseFrom(
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
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource prototype) {
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
     * VolumeAttachmentSource represents a volume that should be attached.
     * Right now only PersistenVolumes can be attached via external attacher,
     * in future we may allow also inline volumes in pods.
     * Exactly one member can be set.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentSource}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.VolumeAttachmentSource)
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.class,
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.newBuilder()
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
        persistentVolumeName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource build() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource buildPartial() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource result =
            new io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.persistentVolumeName_ = persistentVolumeName_;
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
        if (other instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource other) {
        if (other
            == io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.getDefaultInstance())
          return this;
        if (other.hasPersistentVolumeName()) {
          bitField0_ |= 0x00000001;
          persistentVolumeName_ = other.persistentVolumeName_;
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
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource)
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

      private java.lang.Object persistentVolumeName_ = "";
      /**
       *
       *
       * <pre>
       * Name of the persistent volume to attach.
       * +optional
       * </pre>
       *
       * <code>optional string persistentVolumeName = 1;</code>
       */
      public boolean hasPersistentVolumeName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Name of the persistent volume to attach.
       * +optional
       * </pre>
       *
       * <code>optional string persistentVolumeName = 1;</code>
       */
      public java.lang.String getPersistentVolumeName() {
        java.lang.Object ref = persistentVolumeName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            persistentVolumeName_ = s;
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
       * Name of the persistent volume to attach.
       * +optional
       * </pre>
       *
       * <code>optional string persistentVolumeName = 1;</code>
       */
      public com.google.protobuf.ByteString getPersistentVolumeNameBytes() {
        java.lang.Object ref = persistentVolumeName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          persistentVolumeName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name of the persistent volume to attach.
       * +optional
       * </pre>
       *
       * <code>optional string persistentVolumeName = 1;</code>
       */
      public Builder setPersistentVolumeName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        persistentVolumeName_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name of the persistent volume to attach.
       * +optional
       * </pre>
       *
       * <code>optional string persistentVolumeName = 1;</code>
       */
      public Builder clearPersistentVolumeName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        persistentVolumeName_ = getDefaultInstance().getPersistentVolumeName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name of the persistent volume to attach.
       * +optional
       * </pre>
       *
       * <code>optional string persistentVolumeName = 1;</code>
       */
      public Builder setPersistentVolumeNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        persistentVolumeName_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.VolumeAttachmentSource)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.VolumeAttachmentSource)
    private static final io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource();
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<VolumeAttachmentSource> PARSER =
        new com.google.protobuf.AbstractParser<VolumeAttachmentSource>() {
          @java.lang.Override
          public VolumeAttachmentSource parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new VolumeAttachmentSource(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<VolumeAttachmentSource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VolumeAttachmentSource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface VolumeAttachmentSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.VolumeAttachmentSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Attacher indicates the name of the volume driver that MUST handle this
     * request. This is the name returned by GetPluginName().
     * </pre>
     *
     * <code>optional string attacher = 1;</code>
     */
    boolean hasAttacher();
    /**
     *
     *
     * <pre>
     * Attacher indicates the name of the volume driver that MUST handle this
     * request. This is the name returned by GetPluginName().
     * </pre>
     *
     * <code>optional string attacher = 1;</code>
     */
    java.lang.String getAttacher();
    /**
     *
     *
     * <pre>
     * Attacher indicates the name of the volume driver that MUST handle this
     * request. This is the name returned by GetPluginName().
     * </pre>
     *
     * <code>optional string attacher = 1;</code>
     */
    com.google.protobuf.ByteString getAttacherBytes();

    /**
     *
     *
     * <pre>
     * Source represents the volume that should be attached.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
     */
    boolean hasSource();
    /**
     *
     *
     * <pre>
     * Source represents the volume that should be attached.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource getSource();
    /**
     *
     *
     * <pre>
     * Source represents the volume that should be attached.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeAttachmentSourceOrBuilder getSourceOrBuilder();

    /**
     *
     *
     * <pre>
     * The node that the volume should be attached to.
     * </pre>
     *
     * <code>optional string nodeName = 3;</code>
     */
    boolean hasNodeName();
    /**
     *
     *
     * <pre>
     * The node that the volume should be attached to.
     * </pre>
     *
     * <code>optional string nodeName = 3;</code>
     */
    java.lang.String getNodeName();
    /**
     *
     *
     * <pre>
     * The node that the volume should be attached to.
     * </pre>
     *
     * <code>optional string nodeName = 3;</code>
     */
    com.google.protobuf.ByteString getNodeNameBytes();
  }
  /**
   *
   *
   * <pre>
   * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentSpec}
   */
  public static final class VolumeAttachmentSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.VolumeAttachmentSpec)
      VolumeAttachmentSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use VolumeAttachmentSpec.newBuilder() to construct.
    private VolumeAttachmentSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private VolumeAttachmentSpec() {
      attacher_ = "";
      nodeName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private VolumeAttachmentSpec(
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
                attacher_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = source_.toBuilder();
                }
                source_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(source_);
                  source_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                nodeName_ = bs;
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
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.class,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder.class);
    }

    private int bitField0_;
    public static final int ATTACHER_FIELD_NUMBER = 1;
    private volatile java.lang.Object attacher_;
    /**
     *
     *
     * <pre>
     * Attacher indicates the name of the volume driver that MUST handle this
     * request. This is the name returned by GetPluginName().
     * </pre>
     *
     * <code>optional string attacher = 1;</code>
     */
    public boolean hasAttacher() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Attacher indicates the name of the volume driver that MUST handle this
     * request. This is the name returned by GetPluginName().
     * </pre>
     *
     * <code>optional string attacher = 1;</code>
     */
    public java.lang.String getAttacher() {
      java.lang.Object ref = attacher_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          attacher_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Attacher indicates the name of the volume driver that MUST handle this
     * request. This is the name returned by GetPluginName().
     * </pre>
     *
     * <code>optional string attacher = 1;</code>
     */
    public com.google.protobuf.ByteString getAttacherBytes() {
      java.lang.Object ref = attacher_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        attacher_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SOURCE_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource source_;
    /**
     *
     *
     * <pre>
     * Source represents the volume that should be attached.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
     */
    public boolean hasSource() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Source represents the volume that should be attached.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource getSource() {
      return source_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.getDefaultInstance()
          : source_;
    }
    /**
     *
     *
     * <pre>
     * Source represents the volume that should be attached.
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSourceOrBuilder
        getSourceOrBuilder() {
      return source_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.getDefaultInstance()
          : source_;
    }

    public static final int NODENAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object nodeName_;
    /**
     *
     *
     * <pre>
     * The node that the volume should be attached to.
     * </pre>
     *
     * <code>optional string nodeName = 3;</code>
     */
    public boolean hasNodeName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * The node that the volume should be attached to.
     * </pre>
     *
     * <code>optional string nodeName = 3;</code>
     */
    public java.lang.String getNodeName() {
      java.lang.Object ref = nodeName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          nodeName_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * The node that the volume should be attached to.
     * </pre>
     *
     * <code>optional string nodeName = 3;</code>
     */
    public com.google.protobuf.ByteString getNodeNameBytes() {
      java.lang.Object ref = nodeName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nodeName_ = b;
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, attacher_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSource());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nodeName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, attacher_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSource());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nodeName_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec other =
          (io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec) obj;

      boolean result = true;
      result = result && (hasAttacher() == other.hasAttacher());
      if (hasAttacher()) {
        result = result && getAttacher().equals(other.getAttacher());
      }
      result = result && (hasSource() == other.hasSource());
      if (hasSource()) {
        result = result && getSource().equals(other.getSource());
      }
      result = result && (hasNodeName() == other.hasNodeName());
      if (hasNodeName()) {
        result = result && getNodeName().equals(other.getNodeName());
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
      if (hasAttacher()) {
        hash = (37 * hash) + ATTACHER_FIELD_NUMBER;
        hash = (53 * hash) + getAttacher().hashCode();
      }
      if (hasSource()) {
        hash = (37 * hash) + SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getSource().hashCode();
      }
      if (hasNodeName()) {
        hash = (37 * hash) + NODENAME_FIELD_NUMBER;
        hash = (53 * hash) + getNodeName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parseFrom(
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
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec prototype) {
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
     * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.VolumeAttachmentSpec)
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.class,
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getSourceFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        attacher_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (sourceBuilder_ == null) {
          source_ = null;
        } else {
          sourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        nodeName_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec build() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec buildPartial() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec result =
            new io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.attacher_ = attacher_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (sourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = sourceBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.nodeName_ = nodeName_;
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
        if (other instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec other) {
        if (other == io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec.getDefaultInstance())
          return this;
        if (other.hasAttacher()) {
          bitField0_ |= 0x00000001;
          attacher_ = other.attacher_;
          onChanged();
        }
        if (other.hasSource()) {
          mergeSource(other.getSource());
        }
        if (other.hasNodeName()) {
          bitField0_ |= 0x00000004;
          nodeName_ = other.nodeName_;
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
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object attacher_ = "";
      /**
       *
       *
       * <pre>
       * Attacher indicates the name of the volume driver that MUST handle this
       * request. This is the name returned by GetPluginName().
       * </pre>
       *
       * <code>optional string attacher = 1;</code>
       */
      public boolean hasAttacher() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Attacher indicates the name of the volume driver that MUST handle this
       * request. This is the name returned by GetPluginName().
       * </pre>
       *
       * <code>optional string attacher = 1;</code>
       */
      public java.lang.String getAttacher() {
        java.lang.Object ref = attacher_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            attacher_ = s;
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
       * Attacher indicates the name of the volume driver that MUST handle this
       * request. This is the name returned by GetPluginName().
       * </pre>
       *
       * <code>optional string attacher = 1;</code>
       */
      public com.google.protobuf.ByteString getAttacherBytes() {
        java.lang.Object ref = attacher_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          attacher_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Attacher indicates the name of the volume driver that MUST handle this
       * request. This is the name returned by GetPluginName().
       * </pre>
       *
       * <code>optional string attacher = 1;</code>
       */
      public Builder setAttacher(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        attacher_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Attacher indicates the name of the volume driver that MUST handle this
       * request. This is the name returned by GetPluginName().
       * </pre>
       *
       * <code>optional string attacher = 1;</code>
       */
      public Builder clearAttacher() {
        bitField0_ = (bitField0_ & ~0x00000001);
        attacher_ = getDefaultInstance().getAttacher();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Attacher indicates the name of the volume driver that MUST handle this
       * request. This is the name returned by GetPluginName().
       * </pre>
       *
       * <code>optional string attacher = 1;</code>
       */
      public Builder setAttacherBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        attacher_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource source_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSourceOrBuilder>
          sourceBuilder_;
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public boolean hasSource() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource getSource() {
        if (sourceBuilder_ == null) {
          return source_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.getDefaultInstance()
              : source_;
        } else {
          return sourceBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public Builder setSource(io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource value) {
        if (sourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          source_ = value;
          onChanged();
        } else {
          sourceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public Builder setSource(
          io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder builderForValue) {
        if (sourceBuilder_ == null) {
          source_ = builderForValue.build();
          onChanged();
        } else {
          sourceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public Builder mergeSource(
          io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource value) {
        if (sourceBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && source_ != null
              && source_
                  != io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource
                      .getDefaultInstance()) {
            source_ =
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.newBuilder(source_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            source_ = value;
          }
          onChanged();
        } else {
          sourceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public Builder clearSource() {
        if (sourceBuilder_ == null) {
          source_ = null;
          onChanged();
        } else {
          sourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder
          getSourceBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSourceFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSourceOrBuilder
          getSourceOrBuilder() {
        if (sourceBuilder_ != null) {
          return sourceBuilder_.getMessageOrBuilder();
        } else {
          return source_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.getDefaultInstance()
              : source_;
        }
      }
      /**
       *
       *
       * <pre>
       * Source represents the volume that should be attached.
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeAttachmentSource source = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentSourceOrBuilder>
          getSourceFieldBuilder() {
        if (sourceBuilder_ == null) {
          sourceBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentSource.Builder,
                  io.kubernetes.client.proto.V1Storage.VolumeAttachmentSourceOrBuilder>(
                  getSource(), getParentForChildren(), isClean());
          source_ = null;
        }
        return sourceBuilder_;
      }

      private java.lang.Object nodeName_ = "";
      /**
       *
       *
       * <pre>
       * The node that the volume should be attached to.
       * </pre>
       *
       * <code>optional string nodeName = 3;</code>
       */
      public boolean hasNodeName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * The node that the volume should be attached to.
       * </pre>
       *
       * <code>optional string nodeName = 3;</code>
       */
      public java.lang.String getNodeName() {
        java.lang.Object ref = nodeName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            nodeName_ = s;
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
       * The node that the volume should be attached to.
       * </pre>
       *
       * <code>optional string nodeName = 3;</code>
       */
      public com.google.protobuf.ByteString getNodeNameBytes() {
        java.lang.Object ref = nodeName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          nodeName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * The node that the volume should be attached to.
       * </pre>
       *
       * <code>optional string nodeName = 3;</code>
       */
      public Builder setNodeName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        nodeName_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The node that the volume should be attached to.
       * </pre>
       *
       * <code>optional string nodeName = 3;</code>
       */
      public Builder clearNodeName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        nodeName_ = getDefaultInstance().getNodeName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * The node that the volume should be attached to.
       * </pre>
       *
       * <code>optional string nodeName = 3;</code>
       */
      public Builder setNodeNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        nodeName_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.VolumeAttachmentSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.VolumeAttachmentSpec)
    private static final io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec();
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<VolumeAttachmentSpec> PARSER =
        new com.google.protobuf.AbstractParser<VolumeAttachmentSpec>() {
          @java.lang.Override
          public VolumeAttachmentSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new VolumeAttachmentSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<VolumeAttachmentSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VolumeAttachmentSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentSpec getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface VolumeAttachmentStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.VolumeAttachmentStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Indicates the volume is successfully attached.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * </pre>
     *
     * <code>optional bool attached = 1;</code>
     */
    boolean hasAttached();
    /**
     *
     *
     * <pre>
     * Indicates the volume is successfully attached.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * </pre>
     *
     * <code>optional bool attached = 1;</code>
     */
    boolean getAttached();

    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    int getAttachmentMetadataCount();
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    boolean containsAttachmentMetadata(java.lang.String key);
    /** Use {@link #getAttachmentMetadataMap()} instead. */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.String> getAttachmentMetadata();
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    java.util.Map<java.lang.String, java.lang.String> getAttachmentMetadataMap();
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    java.lang.String getAttachmentMetadataOrDefault(
        java.lang.String key, java.lang.String defaultValue);
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    java.lang.String getAttachmentMetadataOrThrow(java.lang.String key);

    /**
     *
     *
     * <pre>
     * The last error encountered during attach operation, if any.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
     */
    boolean hasAttachError();
    /**
     *
     *
     * <pre>
     * The last error encountered during attach operation, if any.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeError getAttachError();
    /**
     *
     *
     * <pre>
     * The last error encountered during attach operation, if any.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder getAttachErrorOrBuilder();

    /**
     *
     *
     * <pre>
     * The last error encountered during detach operation, if any.
     * This field must only be set by the entity completing the detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
     */
    boolean hasDetachError();
    /**
     *
     *
     * <pre>
     * The last error encountered during detach operation, if any.
     * This field must only be set by the entity completing the detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeError getDetachError();
    /**
     *
     *
     * <pre>
     * The last error encountered during detach operation, if any.
     * This field must only be set by the entity completing the detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
     */
    io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder getDetachErrorOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * VolumeAttachmentStatus is the status of a VolumeAttachment request.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentStatus}
   */
  public static final class VolumeAttachmentStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.VolumeAttachmentStatus)
      VolumeAttachmentStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use VolumeAttachmentStatus.newBuilder() to construct.
    private VolumeAttachmentStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private VolumeAttachmentStatus() {
      attached_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private VolumeAttachmentStatus(
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
            case 8:
              {
                bitField0_ |= 0x00000001;
                attached_ = input.readBool();
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  attachmentMetadata_ =
                      com.google.protobuf.MapField.newMapField(
                          AttachmentMetadataDefaultEntryHolder.defaultEntry);
                  mutable_bitField0_ |= 0x00000002;
                }
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
                    attachmentMetadata__ =
                        input.readMessage(
                            AttachmentMetadataDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                attachmentMetadata_
                    .getMutableMap()
                    .put(attachmentMetadata__.getKey(), attachmentMetadata__.getValue());
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1Storage.VolumeError.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = attachError_.toBuilder();
                }
                attachError_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.VolumeError.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(attachError_);
                  attachError_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 34:
              {
                io.kubernetes.client.proto.V1Storage.VolumeError.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = detachError_.toBuilder();
                }
                detachError_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Storage.VolumeError.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(detachError_);
                  detachError_ = subBuilder.buildPartial();
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
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetAttachmentMetadata();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.class,
              io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder.class);
    }

    private int bitField0_;
    public static final int ATTACHED_FIELD_NUMBER = 1;
    private boolean attached_;
    /**
     *
     *
     * <pre>
     * Indicates the volume is successfully attached.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * </pre>
     *
     * <code>optional bool attached = 1;</code>
     */
    public boolean hasAttached() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Indicates the volume is successfully attached.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * </pre>
     *
     * <code>optional bool attached = 1;</code>
     */
    public boolean getAttached() {
      return attached_;
    }

    public static final int ATTACHMENTMETADATA_FIELD_NUMBER = 2;

    private static final class AttachmentMetadataDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
          com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
              io.kubernetes.client.proto.V1Storage
                  .internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_AttachmentMetadataEntry_descriptor,
              com.google.protobuf.WireFormat.FieldType.STRING,
              "",
              com.google.protobuf.WireFormat.FieldType.STRING,
              "");
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> attachmentMetadata_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetAttachmentMetadata() {
      if (attachmentMetadata_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AttachmentMetadataDefaultEntryHolder.defaultEntry);
      }
      return attachmentMetadata_;
    }

    public int getAttachmentMetadataCount() {
      return internalGetAttachmentMetadata().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    public boolean containsAttachmentMetadata(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      return internalGetAttachmentMetadata().getMap().containsKey(key);
    }
    /** Use {@link #getAttachmentMetadataMap()} instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getAttachmentMetadata() {
      return getAttachmentMetadataMap();
    }
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    public java.util.Map<java.lang.String, java.lang.String> getAttachmentMetadataMap() {
      return internalGetAttachmentMetadata().getMap();
    }
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    public java.lang.String getAttachmentMetadataOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAttachmentMetadata().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Upon successful attach, this field is populated with any
     * information returned by the attach operation that must be passed
     * into subsequent WaitForAttach or Mount calls.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
     */
    public java.lang.String getAttachmentMetadataOrThrow(java.lang.String key) {
      if (key == null) {
        throw new java.lang.NullPointerException();
      }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetAttachmentMetadata().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int ATTACHERROR_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1Storage.VolumeError attachError_;
    /**
     *
     *
     * <pre>
     * The last error encountered during attach operation, if any.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
     */
    public boolean hasAttachError() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * The last error encountered during attach operation, if any.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeError getAttachError() {
      return attachError_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
          : attachError_;
    }
    /**
     *
     *
     * <pre>
     * The last error encountered during attach operation, if any.
     * This field must only be set by the entity completing the attach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder getAttachErrorOrBuilder() {
      return attachError_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
          : attachError_;
    }

    public static final int DETACHERROR_FIELD_NUMBER = 4;
    private io.kubernetes.client.proto.V1Storage.VolumeError detachError_;
    /**
     *
     *
     * <pre>
     * The last error encountered during detach operation, if any.
     * This field must only be set by the entity completing the detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
     */
    public boolean hasDetachError() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * The last error encountered during detach operation, if any.
     * This field must only be set by the entity completing the detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeError getDetachError() {
      return detachError_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
          : detachError_;
    }
    /**
     *
     *
     * <pre>
     * The last error encountered during detach operation, if any.
     * This field must only be set by the entity completing the detach
     * operation, i.e. the external-attacher.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
     */
    public io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder getDetachErrorOrBuilder() {
      return detachError_ == null
          ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
          : detachError_;
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
        output.writeBool(1, attached_);
      }
      com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
          output,
          internalGetAttachmentMetadata(),
          AttachmentMetadataDefaultEntryHolder.defaultEntry,
          2);
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(3, getAttachError());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(4, getDetachError());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, attached_);
      }
      for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
          internalGetAttachmentMetadata().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.String> attachmentMetadata__ =
            AttachmentMetadataDefaultEntryHolder.defaultEntry
                .newBuilderForType()
                .setKey(entry.getKey())
                .setValue(entry.getValue())
                .build();
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, attachmentMetadata__);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getAttachError());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getDetachError());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus other =
          (io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus) obj;

      boolean result = true;
      result = result && (hasAttached() == other.hasAttached());
      if (hasAttached()) {
        result = result && (getAttached() == other.getAttached());
      }
      result =
          result && internalGetAttachmentMetadata().equals(other.internalGetAttachmentMetadata());
      result = result && (hasAttachError() == other.hasAttachError());
      if (hasAttachError()) {
        result = result && getAttachError().equals(other.getAttachError());
      }
      result = result && (hasDetachError() == other.hasDetachError());
      if (hasDetachError()) {
        result = result && getDetachError().equals(other.getDetachError());
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
      if (hasAttached()) {
        hash = (37 * hash) + ATTACHED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAttached());
      }
      if (!internalGetAttachmentMetadata().getMap().isEmpty()) {
        hash = (37 * hash) + ATTACHMENTMETADATA_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAttachmentMetadata().hashCode();
      }
      if (hasAttachError()) {
        hash = (37 * hash) + ATTACHERROR_FIELD_NUMBER;
        hash = (53 * hash) + getAttachError().hashCode();
      }
      if (hasDetachError()) {
        hash = (37 * hash) + DETACHERROR_FIELD_NUMBER;
        hash = (53 * hash) + getDetachError().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parseFrom(
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
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus prototype) {
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
     * VolumeAttachmentStatus is the status of a VolumeAttachment request.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.VolumeAttachmentStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.VolumeAttachmentStatus)
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(int number) {
        switch (number) {
          case 2:
            return internalGetAttachmentMetadata();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
        switch (number) {
          case 2:
            return internalGetMutableAttachmentMetadata();
          default:
            throw new RuntimeException("Invalid map field number: " + number);
        }
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.class,
                io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getAttachErrorFieldBuilder();
          getDetachErrorFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        attached_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableAttachmentMetadata().clear();
        if (attachErrorBuilder_ == null) {
          attachError_ = null;
        } else {
          attachErrorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (detachErrorBuilder_ == null) {
          detachError_ = null;
        } else {
          detachErrorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus build() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus buildPartial() {
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus result =
            new io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.attached_ = attached_;
        result.attachmentMetadata_ = internalGetAttachmentMetadata();
        result.attachmentMetadata_.makeImmutable();
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        if (attachErrorBuilder_ == null) {
          result.attachError_ = attachError_;
        } else {
          result.attachError_ = attachErrorBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        if (detachErrorBuilder_ == null) {
          result.detachError_ = detachError_;
        } else {
          result.detachError_ = detachErrorBuilder_.build();
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
        if (other instanceof io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus other) {
        if (other
            == io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus.getDefaultInstance())
          return this;
        if (other.hasAttached()) {
          setAttached(other.getAttached());
        }
        internalGetMutableAttachmentMetadata().mergeFrom(other.internalGetAttachmentMetadata());
        if (other.hasAttachError()) {
          mergeAttachError(other.getAttachError());
        }
        if (other.hasDetachError()) {
          mergeDetachError(other.getDetachError());
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
        io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus)
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

      private boolean attached_;
      /**
       *
       *
       * <pre>
       * Indicates the volume is successfully attached.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * </pre>
       *
       * <code>optional bool attached = 1;</code>
       */
      public boolean hasAttached() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Indicates the volume is successfully attached.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * </pre>
       *
       * <code>optional bool attached = 1;</code>
       */
      public boolean getAttached() {
        return attached_;
      }
      /**
       *
       *
       * <pre>
       * Indicates the volume is successfully attached.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * </pre>
       *
       * <code>optional bool attached = 1;</code>
       */
      public Builder setAttached(boolean value) {
        bitField0_ |= 0x00000001;
        attached_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Indicates the volume is successfully attached.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * </pre>
       *
       * <code>optional bool attached = 1;</code>
       */
      public Builder clearAttached() {
        bitField0_ = (bitField0_ & ~0x00000001);
        attached_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<java.lang.String, java.lang.String> attachmentMetadata_;

      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
          internalGetAttachmentMetadata() {
        if (attachmentMetadata_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AttachmentMetadataDefaultEntryHolder.defaultEntry);
        }
        return attachmentMetadata_;
      }

      private com.google.protobuf.MapField<java.lang.String, java.lang.String>
          internalGetMutableAttachmentMetadata() {
        onChanged();
        ;
        if (attachmentMetadata_ == null) {
          attachmentMetadata_ =
              com.google.protobuf.MapField.newMapField(
                  AttachmentMetadataDefaultEntryHolder.defaultEntry);
        }
        if (!attachmentMetadata_.isMutable()) {
          attachmentMetadata_ = attachmentMetadata_.copy();
        }
        return attachmentMetadata_;
      }

      public int getAttachmentMetadataCount() {
        return internalGetAttachmentMetadata().getMap().size();
      }
      /**
       *
       *
       * <pre>
       * Upon successful attach, this field is populated with any
       * information returned by the attach operation that must be passed
       * into subsequent WaitForAttach or Mount calls.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
       */
      public boolean containsAttachmentMetadata(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        return internalGetAttachmentMetadata().getMap().containsKey(key);
      }
      /** Use {@link #getAttachmentMetadataMap()} instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getAttachmentMetadata() {
        return getAttachmentMetadataMap();
      }
      /**
       *
       *
       * <pre>
       * Upon successful attach, this field is populated with any
       * information returned by the attach operation that must be passed
       * into subsequent WaitForAttach or Mount calls.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
       */
      public java.util.Map<java.lang.String, java.lang.String> getAttachmentMetadataMap() {
        return internalGetAttachmentMetadata().getMap();
      }
      /**
       *
       *
       * <pre>
       * Upon successful attach, this field is populated with any
       * information returned by the attach operation that must be passed
       * into subsequent WaitForAttach or Mount calls.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
       */
      public java.lang.String getAttachmentMetadataOrDefault(
          java.lang.String key, java.lang.String defaultValue) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, java.lang.String> map =
            internalGetAttachmentMetadata().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       *
       *
       * <pre>
       * Upon successful attach, this field is populated with any
       * information returned by the attach operation that must be passed
       * into subsequent WaitForAttach or Mount calls.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
       */
      public java.lang.String getAttachmentMetadataOrThrow(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        java.util.Map<java.lang.String, java.lang.String> map =
            internalGetAttachmentMetadata().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearAttachmentMetadata() {
        internalGetMutableAttachmentMetadata().getMutableMap().clear();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Upon successful attach, this field is populated with any
       * information returned by the attach operation that must be passed
       * into subsequent WaitForAttach or Mount calls.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
       */
      public Builder removeAttachmentMetadata(java.lang.String key) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableAttachmentMetadata().getMutableMap().remove(key);
        return this;
      }
      /** Use alternate mutation accessors instead. */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.String> getMutableAttachmentMetadata() {
        return internalGetMutableAttachmentMetadata().getMutableMap();
      }
      /**
       *
       *
       * <pre>
       * Upon successful attach, this field is populated with any
       * information returned by the attach operation that must be passed
       * into subsequent WaitForAttach or Mount calls.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
       */
      public Builder putAttachmentMetadata(java.lang.String key, java.lang.String value) {
        if (key == null) {
          throw new java.lang.NullPointerException();
        }
        if (value == null) {
          throw new java.lang.NullPointerException();
        }
        internalGetMutableAttachmentMetadata().getMutableMap().put(key, value);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Upon successful attach, this field is populated with any
       * information returned by the attach operation that must be passed
       * into subsequent WaitForAttach or Mount calls.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>map&lt;string, string&gt; attachmentMetadata = 2;</code>
       */
      public Builder putAllAttachmentMetadata(
          java.util.Map<java.lang.String, java.lang.String> values) {
        internalGetMutableAttachmentMetadata().getMutableMap().putAll(values);
        return this;
      }

      private io.kubernetes.client.proto.V1Storage.VolumeError attachError_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeError,
              io.kubernetes.client.proto.V1Storage.VolumeError.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder>
          attachErrorBuilder_;
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public boolean hasAttachError() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeError getAttachError() {
        if (attachErrorBuilder_ == null) {
          return attachError_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
              : attachError_;
        } else {
          return attachErrorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public Builder setAttachError(io.kubernetes.client.proto.V1Storage.VolumeError value) {
        if (attachErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          attachError_ = value;
          onChanged();
        } else {
          attachErrorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public Builder setAttachError(
          io.kubernetes.client.proto.V1Storage.VolumeError.Builder builderForValue) {
        if (attachErrorBuilder_ == null) {
          attachError_ = builderForValue.build();
          onChanged();
        } else {
          attachErrorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public Builder mergeAttachError(io.kubernetes.client.proto.V1Storage.VolumeError value) {
        if (attachErrorBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && attachError_ != null
              && attachError_
                  != io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()) {
            attachError_ =
                io.kubernetes.client.proto.V1Storage.VolumeError.newBuilder(attachError_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            attachError_ = value;
          }
          onChanged();
        } else {
          attachErrorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public Builder clearAttachError() {
        if (attachErrorBuilder_ == null) {
          attachError_ = null;
          onChanged();
        } else {
          attachErrorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeError.Builder getAttachErrorBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getAttachErrorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder getAttachErrorOrBuilder() {
        if (attachErrorBuilder_ != null) {
          return attachErrorBuilder_.getMessageOrBuilder();
        } else {
          return attachError_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
              : attachError_;
        }
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during attach operation, if any.
       * This field must only be set by the entity completing the attach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError attachError = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeError,
              io.kubernetes.client.proto.V1Storage.VolumeError.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder>
          getAttachErrorFieldBuilder() {
        if (attachErrorBuilder_ == null) {
          attachErrorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.VolumeError,
                  io.kubernetes.client.proto.V1Storage.VolumeError.Builder,
                  io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder>(
                  getAttachError(), getParentForChildren(), isClean());
          attachError_ = null;
        }
        return attachErrorBuilder_;
      }

      private io.kubernetes.client.proto.V1Storage.VolumeError detachError_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeError,
              io.kubernetes.client.proto.V1Storage.VolumeError.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder>
          detachErrorBuilder_;
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public boolean hasDetachError() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeError getDetachError() {
        if (detachErrorBuilder_ == null) {
          return detachError_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
              : detachError_;
        } else {
          return detachErrorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public Builder setDetachError(io.kubernetes.client.proto.V1Storage.VolumeError value) {
        if (detachErrorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          detachError_ = value;
          onChanged();
        } else {
          detachErrorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public Builder setDetachError(
          io.kubernetes.client.proto.V1Storage.VolumeError.Builder builderForValue) {
        if (detachErrorBuilder_ == null) {
          detachError_ = builderForValue.build();
          onChanged();
        } else {
          detachErrorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public Builder mergeDetachError(io.kubernetes.client.proto.V1Storage.VolumeError value) {
        if (detachErrorBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)
              && detachError_ != null
              && detachError_
                  != io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()) {
            detachError_ =
                io.kubernetes.client.proto.V1Storage.VolumeError.newBuilder(detachError_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            detachError_ = value;
          }
          onChanged();
        } else {
          detachErrorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public Builder clearDetachError() {
        if (detachErrorBuilder_ == null) {
          detachError_ = null;
          onChanged();
        } else {
          detachErrorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeError.Builder getDetachErrorBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getDetachErrorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      public io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder getDetachErrorOrBuilder() {
        if (detachErrorBuilder_ != null) {
          return detachErrorBuilder_.getMessageOrBuilder();
        } else {
          return detachError_ == null
              ? io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance()
              : detachError_;
        }
      }
      /**
       *
       *
       * <pre>
       * The last error encountered during detach operation, if any.
       * This field must only be set by the entity completing the detach
       * operation, i.e. the external-attacher.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.storage.v1.VolumeError detachError = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Storage.VolumeError,
              io.kubernetes.client.proto.V1Storage.VolumeError.Builder,
              io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder>
          getDetachErrorFieldBuilder() {
        if (detachErrorBuilder_ == null) {
          detachErrorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Storage.VolumeError,
                  io.kubernetes.client.proto.V1Storage.VolumeError.Builder,
                  io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder>(
                  getDetachError(), getParentForChildren(), isClean());
          detachError_ = null;
        }
        return detachErrorBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.VolumeAttachmentStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.VolumeAttachmentStatus)
    private static final io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus();
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<VolumeAttachmentStatus> PARSER =
        new com.google.protobuf.AbstractParser<VolumeAttachmentStatus>() {
          @java.lang.Override
          public VolumeAttachmentStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new VolumeAttachmentStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<VolumeAttachmentStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VolumeAttachmentStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.VolumeAttachmentStatus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface VolumeErrorOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.storage.v1.VolumeError)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Time the error was encountered.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
     */
    boolean hasTime();
    /**
     *
     *
     * <pre>
     * Time the error was encountered.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
     */
    io.kubernetes.client.proto.Meta.Time getTime();
    /**
     *
     *
     * <pre>
     * Time the error was encountered.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
     */
    io.kubernetes.client.proto.Meta.TimeOrBuilder getTimeOrBuilder();

    /**
     *
     *
     * <pre>
     * String detailing the error encountered during Attach or Detach operation.
     * This string may be logged, so it should not contain sensitive
     * information.
     * +optional
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    boolean hasMessage();
    /**
     *
     *
     * <pre>
     * String detailing the error encountered during Attach or Detach operation.
     * This string may be logged, so it should not contain sensitive
     * information.
     * +optional
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    java.lang.String getMessage();
    /**
     *
     *
     * <pre>
     * String detailing the error encountered during Attach or Detach operation.
     * This string may be logged, so it should not contain sensitive
     * information.
     * +optional
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    com.google.protobuf.ByteString getMessageBytes();
  }
  /**
   *
   *
   * <pre>
   * VolumeError captures an error encountered during a volume operation.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.storage.v1.VolumeError}
   */
  public static final class VolumeError extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.storage.v1.VolumeError)
      VolumeErrorOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use VolumeError.newBuilder() to construct.
    private VolumeError(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private VolumeError() {
      message_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private VolumeError(
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
                io.kubernetes.client.proto.Meta.Time.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = time_.toBuilder();
                }
                time_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Time.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(time_);
                  time_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                message_ = bs;
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
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeError_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Storage
          .internal_static_k8s_io_api_storage_v1_VolumeError_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Storage.VolumeError.class,
              io.kubernetes.client.proto.V1Storage.VolumeError.Builder.class);
    }

    private int bitField0_;
    public static final int TIME_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.Time time_;
    /**
     *
     *
     * <pre>
     * Time the error was encountered.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Time the error was encountered.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.Time getTime() {
      return time_ == null ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance() : time_;
    }
    /**
     *
     *
     * <pre>
     * Time the error was encountered.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.TimeOrBuilder getTimeOrBuilder() {
      return time_ == null ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance() : time_;
    }

    public static final int MESSAGE_FIELD_NUMBER = 2;
    private volatile java.lang.Object message_;
    /**
     *
     *
     * <pre>
     * String detailing the error encountered during Attach or Detach operation.
     * This string may be logged, so it should not contain sensitive
     * information.
     * +optional
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * String detailing the error encountered during Attach or Detach operation.
     * This string may be logged, so it should not contain sensitive
     * information.
     * +optional
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * String detailing the error encountered during Attach or Detach operation.
     * This string may be logged, so it should not contain sensitive
     * information.
     * +optional
     * </pre>
     *
     * <code>optional string message = 2;</code>
     */
    public com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        message_ = b;
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getTime());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTime());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V1Storage.VolumeError)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Storage.VolumeError other =
          (io.kubernetes.client.proto.V1Storage.VolumeError) obj;

      boolean result = true;
      result = result && (hasTime() == other.hasTime());
      if (hasTime()) {
        result = result && getTime().equals(other.getTime());
      }
      result = result && (hasMessage() == other.hasMessage());
      if (hasMessage()) {
        result = result && getMessage().equals(other.getMessage());
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
      if (hasTime()) {
        hash = (37 * hash) + TIME_FIELD_NUMBER;
        hash = (53 * hash) + getTime().hashCode();
      }
      if (hasMessage()) {
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError parseFrom(
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

    public static Builder newBuilder(io.kubernetes.client.proto.V1Storage.VolumeError prototype) {
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
     * VolumeError captures an error encountered during a volume operation.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.storage.v1.VolumeError}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.storage.v1.VolumeError)
        io.kubernetes.client.proto.V1Storage.VolumeErrorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeError_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeError_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Storage.VolumeError.class,
                io.kubernetes.client.proto.V1Storage.VolumeError.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Storage.VolumeError.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getTimeFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (timeBuilder_ == null) {
          time_ = null;
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Storage
            .internal_static_k8s_io_api_storage_v1_VolumeError_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeError getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeError build() {
        io.kubernetes.client.proto.V1Storage.VolumeError result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Storage.VolumeError buildPartial() {
        io.kubernetes.client.proto.V1Storage.VolumeError result =
            new io.kubernetes.client.proto.V1Storage.VolumeError(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (timeBuilder_ == null) {
          result.time_ = time_;
        } else {
          result.time_ = timeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.message_ = message_;
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
        if (other instanceof io.kubernetes.client.proto.V1Storage.VolumeError) {
          return mergeFrom((io.kubernetes.client.proto.V1Storage.VolumeError) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Storage.VolumeError other) {
        if (other == io.kubernetes.client.proto.V1Storage.VolumeError.getDefaultInstance())
          return this;
        if (other.hasTime()) {
          mergeTime(other.getTime());
        }
        if (other.hasMessage()) {
          bitField0_ |= 0x00000002;
          message_ = other.message_;
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
        io.kubernetes.client.proto.V1Storage.VolumeError parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Storage.VolumeError) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.Time time_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          timeBuilder_;
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.Time getTime() {
        if (timeBuilder_ == null) {
          return time_ == null ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance() : time_;
        } else {
          return timeBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public Builder setTime(io.kubernetes.client.proto.Meta.Time value) {
        if (timeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          time_ = value;
          onChanged();
        } else {
          timeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public Builder setTime(io.kubernetes.client.proto.Meta.Time.Builder builderForValue) {
        if (timeBuilder_ == null) {
          time_ = builderForValue.build();
          onChanged();
        } else {
          timeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public Builder mergeTime(io.kubernetes.client.proto.Meta.Time value) {
        if (timeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && time_ != null
              && time_ != io.kubernetes.client.proto.Meta.Time.getDefaultInstance()) {
            time_ =
                io.kubernetes.client.proto.Meta.Time.newBuilder(time_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            time_ = value;
          }
          onChanged();
        } else {
          timeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public Builder clearTime() {
        if (timeBuilder_ == null) {
          time_ = null;
          onChanged();
        } else {
          timeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.Time.Builder getTimeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTimeFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.TimeOrBuilder getTimeOrBuilder() {
        if (timeBuilder_ != null) {
          return timeBuilder_.getMessageOrBuilder();
        } else {
          return time_ == null ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance() : time_;
        }
      }
      /**
       *
       *
       * <pre>
       * Time the error was encountered.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time time = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          getTimeFieldBuilder() {
        if (timeBuilder_ == null) {
          timeBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Time,
                  io.kubernetes.client.proto.Meta.Time.Builder,
                  io.kubernetes.client.proto.Meta.TimeOrBuilder>(
                  getTime(), getParentForChildren(), isClean());
          time_ = null;
        }
        return timeBuilder_;
      }

      private java.lang.Object message_ = "";
      /**
       *
       *
       * <pre>
       * String detailing the error encountered during Attach or Detach operation.
       * This string may be logged, so it should not contain sensitive
       * information.
       * +optional
       * </pre>
       *
       * <code>optional string message = 2;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * String detailing the error encountered during Attach or Detach operation.
       * This string may be logged, so it should not contain sensitive
       * information.
       * +optional
       * </pre>
       *
       * <code>optional string message = 2;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            message_ = s;
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
       * String detailing the error encountered during Attach or Detach operation.
       * This string may be logged, so it should not contain sensitive
       * information.
       * +optional
       * </pre>
       *
       * <code>optional string message = 2;</code>
       */
      public com.google.protobuf.ByteString getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * String detailing the error encountered during Attach or Detach operation.
       * This string may be logged, so it should not contain sensitive
       * information.
       * +optional
       * </pre>
       *
       * <code>optional string message = 2;</code>
       */
      public Builder setMessage(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * String detailing the error encountered during Attach or Detach operation.
       * This string may be logged, so it should not contain sensitive
       * information.
       * +optional
       * </pre>
       *
       * <code>optional string message = 2;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * String detailing the error encountered during Attach or Detach operation.
       * This string may be logged, so it should not contain sensitive
       * information.
       * +optional
       * </pre>
       *
       * <code>optional string message = 2;</code>
       */
      public Builder setMessageBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        message_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.storage.v1.VolumeError)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.storage.v1.VolumeError)
    private static final io.kubernetes.client.proto.V1Storage.VolumeError DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Storage.VolumeError();
    }

    public static io.kubernetes.client.proto.V1Storage.VolumeError getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<VolumeError> PARSER =
        new com.google.protobuf.AbstractParser<VolumeError>() {
          @java.lang.Override
          public VolumeError parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new VolumeError(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<VolumeError> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VolumeError> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Storage.VolumeError getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_StorageClass_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_StorageClass_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_StorageClass_ParametersEntry_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_StorageClass_ParametersEntry_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_StorageClassList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_StorageClassList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_VolumeAttachment_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_VolumeAttachment_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_AttachmentMetadataEntry_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_AttachmentMetadataEntry_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_storage_v1_VolumeError_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_storage_v1_VolumeError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%k8s.io/api/storage/v1/generated.proto\022"
          + "\025k8s.io.api.storage.v1\032\"k8s.io/api/core/"
          + "v1/generated.proto\0324k8s.io/apimachinery/"
          + "pkg/apis/meta/v1/generated.proto\032/k8s.io"
          + "/apimachinery/pkg/runtime/generated.prot"
          + "o\0326k8s.io/apimachinery/pkg/runtime/schem"
          + "a/generated.proto\"\216\003\n\014StorageClass\022B\n\010me"
          + "tadata\030\001 \001(\01320.k8s.io.apimachinery.pkg.a"
          + "pis.meta.v1.ObjectMeta\022\023\n\013provisioner\030\002 "
          + "\001(\t\022G\n\nparameters\030\003 \003(\01323.k8s.io.api.sto"
          + "rage.v1.StorageClass.ParametersEntry\022\025\n\r"
          + "reclaimPolicy\030\004 \001(\t\022\024\n\014mountOptions\030\005 \003("
          + "\t\022\034\n\024allowVolumeExpansion\030\006 \001(\010\022\031\n\021volum"
          + "eBindingMode\030\007 \001(\t\022C\n\021allowedTopologies\030"
          + "\010 \003(\0132(.k8s.io.api.core.v1.TopologySelec"
          + "torTerm\0321\n\017ParametersEntry\022\013\n\003key\030\001 \001(\t\022"
          + "\r\n\005value\030\002 \001(\t:\0028\001\"\210\001\n\020StorageClassList\022"
          + "@\n\010metadata\030\001 \001(\0132..k8s.io.apimachinery."
          + "pkg.apis.meta.v1.ListMeta\0222\n\005items\030\002 \003(\013"
          + "2#.k8s.io.api.storage.v1.StorageClass\"\320\001"
          + "\n\020VolumeAttachment\022B\n\010metadata\030\001 \001(\01320.k"
          + "8s.io.apimachinery.pkg.apis.meta.v1.Obje"
          + "ctMeta\0229\n\004spec\030\002 \001(\0132+.k8s.io.api.storag"
          + "e.v1.VolumeAttachmentSpec\022=\n\006status\030\003 \001("
          + "\0132-.k8s.io.api.storage.v1.VolumeAttachme"
          + "ntStatus\"\220\001\n\024VolumeAttachmentList\022@\n\010met"
          + "adata\030\001 \001(\0132..k8s.io.apimachinery.pkg.ap"
          + "is.meta.v1.ListMeta\0226\n\005items\030\002 \003(\0132\'.k8s"
          + ".io.api.storage.v1.VolumeAttachment\"6\n\026V"
          + "olumeAttachmentSource\022\034\n\024persistentVolum"
          + "eName\030\001 \001(\t\"y\n\024VolumeAttachmentSpec\022\020\n\010a"
          + "ttacher\030\001 \001(\t\022=\n\006source\030\002 \001(\0132-.k8s.io.a"
          + "pi.storage.v1.VolumeAttachmentSource\022\020\n\010"
          + "nodeName\030\003 \001(\t\"\272\002\n\026VolumeAttachmentStatu"
          + "s\022\020\n\010attached\030\001 \001(\010\022a\n\022attachmentMetadat"
          + "a\030\002 \003(\0132E.k8s.io.api.storage.v1.VolumeAt"
          + "tachmentStatus.AttachmentMetadataEntry\0227"
          + "\n\013attachError\030\003 \001(\0132\".k8s.io.api.storage"
          + ".v1.VolumeError\0227\n\013detachError\030\004 \001(\0132\".k"
          + "8s.io.api.storage.v1.VolumeError\0329\n\027Atta"
          + "chmentMetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu"
          + "e\030\002 \001(\t:\0028\001\"X\n\013VolumeError\0228\n\004time\030\001 \001(\013"
          + "2*.k8s.io.apimachinery.pkg.apis.meta.v1."
          + "Time\022\017\n\007message\030\002 \001(\tB+\n\032io.kubernetes.c"
          + "lient.protoB\tV1StorageZ\002v1"
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
        },
        assigner);
    internal_static_k8s_io_api_storage_v1_StorageClass_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_storage_v1_StorageClass_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_StorageClass_descriptor,
            new java.lang.String[] {
              "Metadata",
              "Provisioner",
              "Parameters",
              "ReclaimPolicy",
              "MountOptions",
              "AllowVolumeExpansion",
              "VolumeBindingMode",
              "AllowedTopologies",
            });
    internal_static_k8s_io_api_storage_v1_StorageClass_ParametersEntry_descriptor =
        internal_static_k8s_io_api_storage_v1_StorageClass_descriptor.getNestedTypes().get(0);
    internal_static_k8s_io_api_storage_v1_StorageClass_ParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_StorageClass_ParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_k8s_io_api_storage_v1_StorageClassList_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_storage_v1_StorageClassList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_StorageClassList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_storage_v1_VolumeAttachment_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_storage_v1_VolumeAttachment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_VolumeAttachment_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec", "Status",
            });
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_VolumeAttachmentList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_VolumeAttachmentSource_descriptor,
            new java.lang.String[] {
              "PersistentVolumeName",
            });
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_VolumeAttachmentSpec_descriptor,
            new java.lang.String[] {
              "Attacher", "Source", "NodeName",
            });
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_descriptor,
            new java.lang.String[] {
              "Attached", "AttachmentMetadata", "AttachError", "DetachError",
            });
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_AttachmentMetadataEntry_descriptor =
        internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_AttachmentMetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_VolumeAttachmentStatus_AttachmentMetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_k8s_io_api_storage_v1_VolumeError_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_k8s_io_api_storage_v1_VolumeError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_storage_v1_VolumeError_descriptor,
            new java.lang.String[] {
              "Time", "Message",
            });
    io.kubernetes.client.proto.V1.getDescriptor();
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}