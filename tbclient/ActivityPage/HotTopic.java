package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecomTopicList;

/* loaded from: classes4.dex */
public final class HotTopic extends Message {
    public static final Integer DEFAULT_FLOOR_POSITION = 0;
    public static final List<RecomTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer floor_position;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<RecomTopicList> topic_list;

    public static final class Builder extends Message.Builder<HotTopic> {
        public Integer floor_position;
        public List<RecomTopicList> topic_list;

        public Builder() {
        }

        public Builder(HotTopic hotTopic) {
            super(hotTopic);
            if (hotTopic == null) {
                return;
            }
            this.floor_position = hotTopic.floor_position;
            this.topic_list = Message.copyOf(hotTopic.topic_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public HotTopic build(boolean z) {
            return new HotTopic(this, z);
        }
    }

    public HotTopic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.floor_position;
            if (num == null) {
                this.floor_position = DEFAULT_FLOOR_POSITION;
            } else {
                this.floor_position = num;
            }
            List<RecomTopicList> list = builder.topic_list;
            if (list == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
                return;
            } else {
                this.topic_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.floor_position = builder.floor_position;
        this.topic_list = Message.immutableCopyOf(builder.topic_list);
    }
}