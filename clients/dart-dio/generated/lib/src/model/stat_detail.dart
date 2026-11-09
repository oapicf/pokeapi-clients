//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_summary.dart';
import 'package:openapi/src/model/stat_name.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/stat_affecting_moves.dart';
import 'package:openapi/src/model/characteristic_summary.dart';
import 'package:openapi/src/model/move_damage_class_summary.dart';
import 'package:openapi/src/model/stat_affecting_natures.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'stat_detail.g.dart';

/// StatDetail
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [gameIndex] - ID the games use for this stat.
/// * [isBattleOnly] - Whether this stat only exists within a battle.
/// * [affectingMoves] - A detail of moves which affect this stat positively or negatively.
/// * [affectingNatures] - A detail of natures which affect this stat positively or negatively.
/// * [affectingItems] - Items that affect this stat, such as vitamins and battle items.
/// * [characteristics] - A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
/// * [moveDamageClass] - The class of damage this stat is directly related to.
/// * [names] - The name of this resource listed in different languages.
@BuiltValue()
abstract class StatDetail implements Built<StatDetail, StatDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// ID the games use for this stat.
  @BuiltValueField(wireName: r'game_index')
  int get gameIndex;

  /// Whether this stat only exists within a battle.
  @BuiltValueField(wireName: r'is_battle_only')
  bool? get isBattleOnly;

  /// A detail of moves which affect this stat positively or negatively.
  @BuiltValueField(wireName: r'affecting_moves')
  StatAffectingMoves get affectingMoves;

  /// A detail of natures which affect this stat positively or negatively.
  @BuiltValueField(wireName: r'affecting_natures')
  StatAffectingNatures get affectingNatures;

  /// Items that affect this stat, such as vitamins and battle items.
  @BuiltValueField(wireName: r'affecting_items')
  BuiltList<ItemSummary> get affectingItems;

  /// A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
  @BuiltValueField(wireName: r'characteristics')
  BuiltList<CharacteristicSummary> get characteristics;

  /// The class of damage this stat is directly related to.
  @BuiltValueField(wireName: r'move_damage_class')
  MoveDamageClassSummary? get moveDamageClass;

  /// The name of this resource listed in different languages.
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
      specifiedType: const FullType(StatAffectingMoves),
    );
    yield r'affecting_natures';
    yield serializers.serialize(
      object.affectingNatures,
      specifiedType: const FullType(StatAffectingNatures),
    );
    yield r'affecting_items';
    yield serializers.serialize(
      object.affectingItems,
      specifiedType: const FullType(BuiltList, [FullType(ItemSummary)]),
    );
    yield r'characteristics';
    yield serializers.serialize(
      object.characteristics,
      specifiedType: const FullType(BuiltList, [FullType(CharacteristicSummary)]),
    );
    yield r'move_damage_class';
    yield object.moveDamageClass == null ? null : serializers.serialize(
      object.moveDamageClass,
      specifiedType: const FullType.nullable(MoveDamageClassSummary),
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
            specifiedType: const FullType(StatAffectingMoves),
          ) as StatAffectingMoves;
          result.affectingMoves.replace(valueDes);
          break;
        case r'affecting_natures':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(StatAffectingNatures),
          ) as StatAffectingNatures;
          result.affectingNatures.replace(valueDes);
          break;
        case r'affecting_items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemSummary)]),
          ) as BuiltList<ItemSummary>;
          result.affectingItems.replace(valueDes);
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
            specifiedType: const FullType.nullable(MoveDamageClassSummary),
          ) as MoveDamageClassSummary?;
          if (valueDes == null) continue;
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


