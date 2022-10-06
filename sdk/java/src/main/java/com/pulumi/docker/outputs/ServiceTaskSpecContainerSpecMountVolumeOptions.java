// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.docker.outputs.ServiceTaskSpecContainerSpecMountVolumeOptionsLabel;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTaskSpecContainerSpecMountVolumeOptions {
    private @Nullable String driverName;
    private @Nullable Map<String,String> driverOptions;
    /**
     * @return User-defined key/value metadata
     * 
     */
    private @Nullable List<ServiceTaskSpecContainerSpecMountVolumeOptionsLabel> labels;
    private @Nullable Boolean noCopy;

    private ServiceTaskSpecContainerSpecMountVolumeOptions() {}
    public Optional<String> driverName() {
        return Optional.ofNullable(this.driverName);
    }
    public Map<String,String> driverOptions() {
        return this.driverOptions == null ? Map.of() : this.driverOptions;
    }
    /**
     * @return User-defined key/value metadata
     * 
     */
    public List<ServiceTaskSpecContainerSpecMountVolumeOptionsLabel> labels() {
        return this.labels == null ? List.of() : this.labels;
    }
    public Optional<Boolean> noCopy() {
        return Optional.ofNullable(this.noCopy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecMountVolumeOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String driverName;
        private @Nullable Map<String,String> driverOptions;
        private @Nullable List<ServiceTaskSpecContainerSpecMountVolumeOptionsLabel> labels;
        private @Nullable Boolean noCopy;
        public Builder() {}
        public Builder(ServiceTaskSpecContainerSpecMountVolumeOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverName = defaults.driverName;
    	      this.driverOptions = defaults.driverOptions;
    	      this.labels = defaults.labels;
    	      this.noCopy = defaults.noCopy;
        }

        @CustomType.Setter
        public Builder driverName(@Nullable String driverName) {
            this.driverName = driverName;
            return this;
        }
        @CustomType.Setter
        public Builder driverOptions(@Nullable Map<String,String> driverOptions) {
            this.driverOptions = driverOptions;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable List<ServiceTaskSpecContainerSpecMountVolumeOptionsLabel> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(ServiceTaskSpecContainerSpecMountVolumeOptionsLabel... labels) {
            return labels(List.of(labels));
        }
        @CustomType.Setter
        public Builder noCopy(@Nullable Boolean noCopy) {
            this.noCopy = noCopy;
            return this;
        }
        public ServiceTaskSpecContainerSpecMountVolumeOptions build() {
            final var o = new ServiceTaskSpecContainerSpecMountVolumeOptions();
            o.driverName = driverName;
            o.driverOptions = driverOptions;
            o.labels = labels;
            o.noCopy = noCopy;
            return o;
        }
    }
}
