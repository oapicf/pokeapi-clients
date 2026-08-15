//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/super_contest_effect_flavor_text.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'super_contest_effect_detail.g.dart';

/// SuperContestEffectDetail
///
/// Properties:
/// * [id] 
/// * [appeal] 
/// * [flavorTextEntries] 
/// * [moves] 
@BuiltValue()
abstract class SuperContestEffectDetail implements Built<SuperContestEffectDetail, SuperContestEffectDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'appeal')
  int get appeal;

  @BuiltValueField(wireName: r'flavor_text_entries')
  BuiltList<SuperContestEffectFlavorText> get flavorTextEntries;

  @BuiltValueField(wireName: r'moves')
  BuiltList<MoveSummary> get moves;

  SuperContestEffectDetail._();

  factory SuperContestEffectDetail([void updates(SuperContestEffectDetailBuilder b)]) = _$SuperContestEffectDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SuperContestEffectDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SuperContestEffectDetail> get serializer => _$SuperContestEffectDetailSerializer();
}

class _$SuperContestEffectDetailSerializer implements PrimitiveSerializer<SuperContestEffectDetail> {
  @override
  final Iterable<Type> types = const [SuperContestEffectDetail, _$SuperContestEffectDetail];

  @override
  final String wireName = r'SuperContestEffectDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SuperContestEffectDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'appeal';
    yield serializers.serialize(
      object.appeal,
      specifiedType: const FullType(int),
    );
    yield r'flavor_text_entries';
    yield serializers.serialize(
      object.flavorTextEntries,
      specifiedType: const FullType(BuiltList, [FullType(SuperContestEffectFlavorText)]),
    );
    yield r'moves';
    yield serializers.serialize(
      object.moves,
      specifiedType: const FullType(BuiltList, [FullType(MoveSummary)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    SuperContestEffectDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SuperContestEffectDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'appeal':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.appeal = valueDes;
          break;
        case r'flavor_text_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(SuperContestEffectFlavorText)]),
          ) as BuiltList<SuperContestEffectFlavorText>;
          result.flavorTextEntries.replace(valueDes);
          break;
        case r'moves':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveSummary)]),
          ) as BuiltList<MoveSummary>;
          result.moves.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SuperContestEffectDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SuperContestEffectDetailBuilder();
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

