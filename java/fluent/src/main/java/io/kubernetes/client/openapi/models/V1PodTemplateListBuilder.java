package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1PodTemplateListBuilder extends io.kubernetes.client.openapi.models.V1PodTemplateListFluentImpl<io.kubernetes.client.openapi.models.V1PodTemplateListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PodTemplateList,io.kubernetes.client.openapi.models.V1PodTemplateListBuilder>{
  public V1PodTemplateListBuilder() {
    this(false);
  }
  public V1PodTemplateListBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PodTemplateList(), validationEnabled);
  }
  public V1PodTemplateListBuilder(io.kubernetes.client.openapi.models.V1PodTemplateListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodTemplateListBuilder(io.kubernetes.client.openapi.models.V1PodTemplateListFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodTemplateList(), validationEnabled);
  }
  public V1PodTemplateListBuilder(io.kubernetes.client.openapi.models.V1PodTemplateListFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodTemplateList instance) {
    this(fluent, instance, false);
  }
  public V1PodTemplateListBuilder(io.kubernetes.client.openapi.models.V1PodTemplateListFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodTemplateList instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodTemplateListBuilder(io.kubernetes.client.openapi.models.V1PodTemplateList instance) {
    this(instance,false);
  }
  public V1PodTemplateListBuilder(io.kubernetes.client.openapi.models.V1PodTemplateList instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1PodTemplateListFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1PodTemplateList build() {
    V1PodTemplateList buildable = new V1PodTemplateList();
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
    V1PodTemplateListBuilder that = (V1PodTemplateListBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}