//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/berry_firmness_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'paginated_berry_firmness_summary_list.g.dart';

/// PaginatedBerryFirmnessSummaryList
///
/// Properties:
/// * [count] 
/// * [next] 
/// * [previous] 
/// * [results] 
@BuiltValue()
abstract class PaginatedBerryFirmnessSummaryList implements Built<PaginatedBerryFirmnessSummaryList, PaginatedBerryFirmnessSummaryListBuilder> {
  @BuiltValueField(wireName: r'count')
  int? get count;

  @BuiltValueField(wireName: r'next')
  String? get next;

  @BuiltValueField(wireName: r'previous')
  String? get previous;

  @BuiltValueField(wireName: r'results')
  BuiltList<BerryFirmnessSummary>? get results;

  PaginatedBerryFirmnessSummaryList._();

  factory PaginatedBerryFirmnessSummaryList([void updates(PaginatedBerryFirmnessSummaryListBuilder b)]) = _$PaginatedBerryFirmnessSummaryList;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PaginatedBerryFirmnessSummaryListBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PaginatedBerryFirmnessSummaryList> get serializer => _$PaginatedBerryFirmnessSummaryListSerializer();
}

class _$PaginatedBerryFirmnessSummaryListSerializer implements PrimitiveSerializer<PaginatedBerryFirmnessSummaryList> {
  @override
  final Iterable<Type> types = const [PaginatedBerryFirmnessSummaryList, _$PaginatedBerryFirmnessSummaryList];

  @override
  final String wireName = r'PaginatedBerryFirmnessSummaryList';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PaginatedBerryFirmnessSummaryList object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.count != null) {
      yield r'count';
      yield serializers.serialize(
        object.count,
        specifiedType: const FullType(int),
      );
    }
    if (object.next != null) {
      yield r'next';
      yield serializers.serialize(
        object.next,
        specifiedType: const FullType(String),
      );
    }
    if (object.previous != null) {
      yield r'previous';
      yield serializers.serialize(
        object.previous,
        specifiedType: const FullType(String),
      );
    }
    if (object.results != null) {
      yield r'results';
      yield serializers.serialize(
        object.results,
        specifiedType: const FullType(BuiltList, [FullType(BerryFirmnessSummary)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PaginatedBerryFirmnessSummaryList object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PaginatedBerryFirmnessSummaryListBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.count = valueDes;
          break;
        case r'next':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.next = valueDes;
          break;
        case r'previous':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.previous = valueDes;
          break;
        case r'results':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(BerryFirmnessSummary)]),
          ) as BuiltList<BerryFirmnessSummary>;
          result.results.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PaginatedBerryFirmnessSummaryList deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PaginatedBerryFirmnessSummaryListBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

