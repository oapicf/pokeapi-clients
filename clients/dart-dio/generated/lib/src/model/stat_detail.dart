//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/stat_name.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/characteristic_summary.dart';
import 'package:openapi/src/model/move_damage_class_summary.dart';
import 'package:openapi/src/model/stat_detail_affecting_natures.dart';
import 'package:openapi/src/model/stat_detail_affecting_moves.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'stat_detail.g.dart';

/// StatDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [gameIndex] 
/// * [isBattleOnly] 
/// * [affectingMoves] 
/// * [affectingNatures] 
/// * [characteristics] 
/// * [moveDamageClass] 
/// * [names] 
@BuiltValue()
abstract class StatDetail implements Built<StatDetail, StatDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'game_index')
  int get gameIndex;

  @BuiltValueField(wireName: r'is_battle_only')
  bool? get isBattleOnly;

  @BuiltValueField(wireName: r'affecting_moves')
  StatDetailAffectingMoves get affectingMoves;

  @BuiltValueField(wireName: r'affecting_natures')
  StatDetailAffectingNatures get affectingNatures;

  @BuiltValueField(wireName: r'characteristics')
  BuiltList<CharacteristicSummary> get characteristics;

  @BuiltValueField(wireName: r'move_damage_class')
  MoveDamageClassSummary get moveDamageClass;

  @BuiltValueField(wireName: r'names')
  BuiltList<StatName> get names;

  StatDetail._();

  factory StatDetail([void updates(StatDetailBuilder b)]) = _$StatDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(StatDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<StatDetail> get serializer => _$StatDetailSerializer();
}

class _$StatDetailSerializer implements PrimitiveSerializer<StatDetail> {
  @override
  final Iterable<Type> types = const [StatDetail, _$StatDetail];

  @override
  final String wireName = r'StatDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    StatDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'game_index';
    yield serializers.serialize(
      object.gameIndex,
      specifiedType: const FullType(int),
    );
    if (object.isBattleOnly != null) {
      yield r'is_battle_only';
      yield serializers.serialize(
        object.isBattleOnly,
        specifiedType: const FullType(bool),
      );
    }
    yield r'affecting_moves';
    yield serializers.serialize(
      object.affectingMoves,
      specifiedType: const FullType(StatDetailAffectingMoves),
    );
    yield r'affecting_natures';
    yield serializers.serialize(
      object.affectingNatures,
      specifiedType: const FullType(StatDetailAffectingNatures),
    );
    yield r'characteristics';
    yield serializers.serialize(
      object.characteristics,
      specifiedType: const FullType(BuiltList, [FullType(CharacteristicSummary)]),
    );
    yield r'move_damage_class';
    yield serializers.serialize(
      object.moveDamageClass,
      specifiedType: const FullType(MoveDamageClassSummary),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(StatName)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    StatDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required StatDetailBuilder result,
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
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'game_index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.gameIndex = valueDes;
          break;
        case r'is_battle_only':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isBattleOnly = valueDes;
          break;
        case r'affecting_moves':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(StatDetailAffectingMoves),
          ) as StatDetailAffectingMoves;
          result.affectingMoves.replace(valueDes);
          break;
        case r'affecting_natures':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(StatDetailAffectingNatures),
          ) as StatDetailAffectingNatures;
          result.affectingNatures.replace(valueDes);
          break;
        case r'characteristics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CharacteristicSummary)]),
          ) as BuiltList<CharacteristicSummary>;
          result.characteristics.replace(valueDes);
          break;
        case r'move_damage_class':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveDamageClassSummary),
          ) as MoveDamageClassSummary;
          result.moveDamageClass.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(StatName)]),
          ) as BuiltList<StatName>;
          result.names.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  StatDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = StatDetailBuilder();
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

