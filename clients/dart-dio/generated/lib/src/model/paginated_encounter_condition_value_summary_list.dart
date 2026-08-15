//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/encounter_condition_value_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'paginated_encounter_condition_value_summary_list.g.dart';

/// PaginatedEncounterConditionValueSummaryList
///
/// Properties:
/// * [count] 
/// * [next] 
/// * [previous] 
/// * [results] 
@BuiltValue()
abstract class PaginatedEncounterConditionValueSummaryList implements Built<PaginatedEncounterConditionValueSummaryList, PaginatedEncounterConditionValueSummaryListBuilder> {
  @BuiltValueField(wireName: r'count')
  int? get count;

  @BuiltValueField(wireName: r'next')
  String? get next;

  @BuiltValueField(wireName: r'previous')
  String? get previous;

  @BuiltValueField(wireName: r'results')
  BuiltList<EncounterConditionValueSummary>? get results;

  PaginatedEncounterConditionValueSummaryList._();

  factory PaginatedEncounterConditionValueSummaryList([void updates(PaginatedEncounterConditionValueSummaryListBuilder b)]) = _$PaginatedEncounterConditionValueSummaryList;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PaginatedEncounterConditionValueSummaryListBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PaginatedEncounterConditionValueSummaryList> get serializer => _$PaginatedEncounterConditionValueSummaryListSerializer();
}

class _$PaginatedEncounterConditionValueSummaryListSerializer implements PrimitiveSerializer<PaginatedEncounterConditionValueSummaryList> {
  @override
  final Iterable<Type> types = const [PaginatedEncounterConditionValueSummaryList, _$PaginatedEncounterConditionValueSummaryList];

  @override
  final String wireName = r'PaginatedEncounterConditionValueSummaryList';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PaginatedEncounterConditionValueSummaryList object, {
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
        specifiedType: const FullType(BuiltList, [FullType(EncounterConditionValueSummary)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PaginatedEncounterConditionValueSummaryList object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PaginatedEncounterConditionValueSummaryListBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(EncounterConditionValueSummary)]),
          ) as BuiltList<EncounterConditionValueSummary>;
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
  PaginatedEncounterConditionValueSummaryList deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PaginatedEncounterConditionValueSummaryListBuilder();
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

