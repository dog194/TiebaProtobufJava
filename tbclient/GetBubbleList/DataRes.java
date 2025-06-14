package tbclient.GetBubbleList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeBgProp;
import tbclient.ThemeRecommand;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final List<ThemeBgProp> DEFAULT_BUBBLES = Collections.emptyList();
    public static final Integer DEFAULT_HASMORE = 0;
    public static final Integer DEFAULT_IS_DEFAULT = 0;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThemeBgProp> bubbles;

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer hasmore;

    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_default;

    @ProtoField(tag = 1)
    public final ThemeRecommand recommend;

    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThemeBgProp> bubbles;
        public Integer hasmore;
        public Integer is_default;
        public ThemeRecommand recommend;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.recommend = dataRes.recommend;
            this.bubbles = Message.copyOf(dataRes.bubbles);
            this.hasmore = dataRes.hasmore;
            this.is_default = dataRes.is_default;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.recommend = builder.recommend;
            List<ThemeBgProp> list = builder.bubbles;
            if (list == null) {
                this.bubbles = DEFAULT_BUBBLES;
            } else {
                this.bubbles = Message.immutableCopyOf(list);
            }
            Integer num = builder.hasmore;
            if (num == null) {
                this.hasmore = DEFAULT_HASMORE;
            } else {
                this.hasmore = num;
            }
            Integer num2 = builder.is_default;
            if (num2 == null) {
                this.is_default = DEFAULT_IS_DEFAULT;
                return;
            } else {
                this.is_default = num2;
                return;
            }
        }
        this.recommend = builder.recommend;
        this.bubbles = Message.immutableCopyOf(builder.bubbles);
        this.hasmore = builder.hasmore;
        this.is_default = builder.is_default;
    }
}