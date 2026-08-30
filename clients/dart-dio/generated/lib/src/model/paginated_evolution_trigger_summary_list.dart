//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/evolution_trigger_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'paginated_evolution_trigger_summary_list.g.dart';

/// PaginatedEvolutionTriggerSummaryList
///
/// Properties:
/// * [count] 
/// * [next] 
/// * [previous] 
/// * [results] 
@BuiltValue()
abstract class PaginatedEvolutionTriggerSummaryList implements Built<PaginatedEvolutionTriggerSummaryList, PaginatedEvolutionTriggerSummaryListBuilder> {
  @BuiltValueField(wireName: r'count')
  int? get count;

  @BuiltValueField(wireName: r'next')
  String? get next;

  @BuiltValueField(wireName: r'previous')
  String? get previous;

  @BuiltValueField(wireName: r'results')
  BuiltList<EvolutionTriggerSummary>? get results;

  PaginatedEvolutionTriggerSummaryList._();

  factory PaginatedEvolutionTriggerSummaryList([void updates(PaginatedEvolutionTriggerSummaryListBuilder b)]) = _$PaginatedEvolutionTriggerSummaryList;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PaginatedEvolutionTriggerSummaryListBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PaginatedEvolutionTriggerSummaryList> get serializer => _$PaginatedEvolutionTriggerSummaryListSerializer();
}

class _$PaginatedEvolutionTriggerSummaryListSerializer implements PrimitiveSerializer<PaginatedEvolutionTriggerSummaryList> {
  @override
  final Iterable<Type> types = const [PaginatedEvolutionTriggerSummaryList, _$PaginatedEvolutionTriggerSummaryList];

  @override
  final String wireName = r'PaginatedEvolutionTriggerSummaryList';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PaginatedEvolutionTriggerSummaryList object, {
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
        specifiedType: const FullType(BuiltList, [FullType(EvolutionTriggerSummary)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PaginatedEvolutionTriggerSummaryList object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PaginatedEvolutionTriggerSummaryListBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.count = valueDes;
          break;
        case r'next':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.next = valueDes;
          break;
        case r'previous':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.previous = valueDes;
          break;
        case r'results':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(EvolutionTriggerSummary)]),
          ) as BuiltList<EvolutionTriggerSummary>?;
          if (valueDes == null) continue;
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
  PaginatedEvolutionTriggerSummaryList deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PaginatedEvolutionTriggerSummaryListBuilder();
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

