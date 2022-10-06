// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContainerUlimit {
    /**
     * @return The hard limit
     * 
     */
    private Integer hard;
    /**
     * @return The name of the ulimit
     * 
     */
    private String name;
    /**
     * @return The soft limit
     * 
     */
    private Integer soft;

    private ContainerUlimit() {}
    /**
     * @return The hard limit
     * 
     */
    public Integer hard() {
        return this.hard;
    }
    /**
     * @return The name of the ulimit
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The soft limit
     * 
     */
    public Integer soft() {
        return this.soft;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerUlimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer hard;
        private String name;
        private Integer soft;
        public Builder() {}
        public Builder(ContainerUlimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hard = defaults.hard;
    	      this.name = defaults.name;
    	      this.soft = defaults.soft;
        }

        @CustomType.Setter
        public Builder hard(Integer hard) {
            this.hard = Objects.requireNonNull(hard);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder soft(Integer soft) {
            this.soft = Objects.requireNonNull(soft);
            return this;
        }
        public ContainerUlimit build() {
            final var o = new ContainerUlimit();
            o.hard = hard;
            o.name = name;
            o.soft = soft;
            return o;
        }
    }
}
