package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1NamespaceListBuilder extends io.kubernetes.client.openapi.models.V1NamespaceListFluentImpl<io.kubernetes.client.openapi.models.V1NamespaceListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1NamespaceList,io.kubernetes.client.openapi.models.V1NamespaceListBuilder>{
  public V1NamespaceListBuilder() {
    this(false);
  }
  public V1NamespaceListBuilder(java.lang.Boolean validationEnabled) {
    this(new V1NamespaceList(), validationEnabled);
  }
  public V1NamespaceListBuilder(io.kubernetes.client.openapi.models.V1NamespaceListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NamespaceListBuilder(io.kubernetes.client.openapi.models.V1NamespaceListFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1NamespaceList(), validationEnabled);
  }
  public V1NamespaceListBuilder(io.kubernetes.client.openapi.models.V1NamespaceListFluent<?> fluent,io.kubernetes.client.openapi.models.V1NamespaceList instance) {
    this(fluent, instance, false);
  }
  public V1NamespaceListBuilder(io.kubernetes.client.openapi.models.V1NamespaceListFluent<?> fluent,io.kubernetes.client.openapi.models.V1NamespaceList instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1NamespaceListBuilder(io.kubernetes.client.openapi.models.V1NamespaceList instance) {
    this(instance,false);
  }
  public V1NamespaceListBuilder(io.kubernetes.client.openapi.models.V1NamespaceList instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1NamespaceListFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1NamespaceList build() {
    V1NamespaceList buildable = new V1NamespaceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NamespaceListBuilder that = (V1NamespaceListBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}