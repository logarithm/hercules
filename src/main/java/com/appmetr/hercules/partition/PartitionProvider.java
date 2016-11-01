package com.appmetr.hercules.partition;

import com.appmetr.hercules.wide.SliceDataSpecificator;
import com.appmetr.hercules.wide.SliceDataSpecificatorByCF;

import java.util.List;

public interface PartitionProvider<R, T> {
    String getPartition(R rowKey, T topKey);

    List<R> getPartitionedRowKeys(R rowKey, SliceDataSpecificator<T> sliceDataSpecificator);

    List<SliceDataSpecificatorByCF<T>> getPartitionedQueries(R rowKey, SliceDataSpecificator<T> sliceDataSpecificator);

    List<String> getPartitionsForCreation();

    R getPartitionedRowKey(R rowKey, T topKey);
}
