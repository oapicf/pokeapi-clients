//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/berry_flavor_summary.dart';
import 'package:openapi/src/model/nature_name.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/nature_pokeathlon_stat.dart';
import 'package:openapi/src/model/stat_summary.dart';
import 'package:openapi/src/model/nature_battle_style_preference.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'nature_detail.g.dart';

/// NatureDetail
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [decreasedStat] - The stat decreased by 10% in Pokémon with this nature.
/// * [increasedStat] - The stat increased by 10% in Pokémon with this nature.
/// * [likesFlavor] - The flavor liked by Pokémon with this nature.
/// * [hatesFlavor] - The flavor hated by Pokémon with this nature.
/// * [pokeathlonStatChanges] - A list of Pokéathlon stats this nature effects and how much it effects them.
/// * [moveBattleStylePreferences] - A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
/// * [names] - The name of this resource listed in different languages.
@BuiltValue()
abstract class NatureDetail implements Built<NatureDetail, NatureDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The stat decreased by 10% in Pokémon with this nature.
  @BuiltValueField(wireName: r'decreased_stat')
  StatSummary? get decreasedStat;

  /// The stat increased by 10% in Pokémon with this nature.
  @BuiltValueField(wireName: r'increased_stat')
  StatSummary? get increasedStat;

  /// The flavor liked by Pokémon with this nature.
  @BuiltValueField(wireName: r'likes_flavor')
  BerryFlavorSummary? get likesFlavor;

  /// The flavor hated by Pokémon with this nature.
  @BuiltValueField(wireName: r'hates_flavor')
  BerryFlavorSummary? get hatesFlavor;

  /// A list of Pokéathlon stats this nature effects and how much it effects them.
  @BuiltValueField(wireName: r'pokeathlon_stat_changes')
  BuiltList<NaturePokeathlonStat> get pokeathlonStatChanges;

  /// A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
  @BuiltValueField(wireName: r'move_battle_style_preferences')
  BuiltList<NatureBattleStylePreference> get moveBattleStylePreferences;

  /// The name of this resource listed in different languages.
  @BuiltValueField(wireName: r'names')
  BuiltList<NatureName> get names;

  NatureDetail._();

  factory NatureDetail([void updates(NatureDetailBuilder b)]) = _$NatureDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(NatureDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<NatureDetail> get serializer => _$NatureDetailSerializer();
}

class _$NatureDetailSerializer implements PrimitiveSerializer<NatureDetail> {
  @override
  final Iterable<Type> types = const [NatureDetail, _$NatureDetail];

  @override
  final String wireName = r'NatureDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    NatureDetail object, {
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
    yield r'decreased_stat';
    yield object.decreasedStat == null ? null : serializers.serialize(
      object.decreasedStat,
      specifiedType: const FullType.nullable(StatSummary),
    );
    yield r'increased_stat';
    yield object.increasedStat == null ? null : serializers.serialize(
      object.increasedStat,
      specifiedType: const FullType.nullable(StatSummary),
    );
    yield r'likes_flavor';
    yield object.likesFlavor == null ? null : serializers.serialize(
      object.likesFlavor,
      specifiedType: const FullType.nullable(BerryFlavorSummary),
    );
    yield r'hates_flavor';
    yield object.hatesFlavor == null ? null : serializers.serialize(
      object.hatesFlavor,
      specifiedType: const FullType.nullable(BerryFlavorSummary),
    );
    yield r'pokeathlon_stat_changes';
    yield serializers.serialize(
      object.pokeathlonStatChanges,
      specifiedType: const FullType(BuiltList, [FullType(NaturePokeathlonStat)]),
    );
    yield r'move_battle_style_preferences';
    yield serializers.serialize(
      object.moveBattleStylePreferences,
      specifiedType: const FullType(BuiltList, [FullType(NatureBattleStylePreference)]),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(NatureName)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    NatureDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required NatureDetailBuilder result,
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
        case r'decreased_stat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(StatSummary),
          ) as StatSummary?;
          if (valueDes == null) continue;
          result.decreasedStat.replace(valueDes);
          break;
        case r'increased_stat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(StatSummary),
          ) as StatSummary?;
          if (valueDes == null) continue;
          result.increasedStat.replace(valueDes);
          break;
        case r'likes_flavor':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BerryFlavorSummary),
          ) as BerryFlavorSummary?;
          if (valueDes == null) continue;
          result.likesFlavor.replace(valueDes);
          break;
        case r'hates_flavor':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BerryFlavorSummary),
          ) as BerryFlavorSummary?;
          if (valueDes == null) continue;
          result.hatesFlavor.replace(valueDes);
          break;
        case r'pokeathlon_stat_changes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(NaturePokeathlonStat)]),
          ) as BuiltList<NaturePokeathlonStat>;
          result.pokeathlonStatChanges.replace(valueDes);
          break;
        case r'move_battle_style_preferences':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(NatureBattleStylePreference)]),
          ) as BuiltList<NatureBattleStylePreference>;
          result.moveBattleStylePreferences.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(NatureName)]),
          ) as BuiltList<NatureName>;
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
  NatureDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = NatureDetailBuilder();
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


