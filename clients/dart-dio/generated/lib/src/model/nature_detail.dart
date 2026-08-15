//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/nature_detail_pokeathlon_stat_changes_inner.dart';
import 'package:openapi/src/model/berry_summary.dart';
import 'package:openapi/src/model/berry_flavor_summary.dart';
import 'package:openapi/src/model/nature_name.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/stat_summary.dart';
import 'package:openapi/src/model/nature_battle_style_preference.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'nature_detail.g.dart';

/// NatureDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [decreasedStat] 
/// * [increasedStat] 
/// * [likesFlavor] 
/// * [hatesFlavor] 
/// * [berries] 
/// * [pokeathlonStatChanges] 
/// * [moveBattleStylePreferences] 
/// * [names] 
@BuiltValue()
abstract class NatureDetail implements Built<NatureDetail, NatureDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'decreased_stat')
  StatSummary get decreasedStat;

  @BuiltValueField(wireName: r'increased_stat')
  StatSummary get increasedStat;

  @BuiltValueField(wireName: r'likes_flavor')
  BerryFlavorSummary get likesFlavor;

  @BuiltValueField(wireName: r'hates_flavor')
  BerryFlavorSummary get hatesFlavor;

  @BuiltValueField(wireName: r'berries')
  BuiltList<BerrySummary> get berries;

  @BuiltValueField(wireName: r'pokeathlon_stat_changes')
  BuiltList<NatureDetailPokeathlonStatChangesInner> get pokeathlonStatChanges;

  @BuiltValueField(wireName: r'move_battle_style_preferences')
  BuiltList<NatureBattleStylePreference> get moveBattleStylePreferences;

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
    yield serializers.serialize(
      object.decreasedStat,
      specifiedType: const FullType(StatSummary),
    );
    yield r'increased_stat';
    yield serializers.serialize(
      object.increasedStat,
      specifiedType: const FullType(StatSummary),
    );
    yield r'likes_flavor';
    yield serializers.serialize(
      object.likesFlavor,
      specifiedType: const FullType(BerryFlavorSummary),
    );
    yield r'hates_flavor';
    yield serializers.serialize(
      object.hatesFlavor,
      specifiedType: const FullType(BerryFlavorSummary),
    );
    yield r'berries';
    yield serializers.serialize(
      object.berries,
      specifiedType: const FullType(BuiltList, [FullType(BerrySummary)]),
    );
    yield r'pokeathlon_stat_changes';
    yield serializers.serialize(
      object.pokeathlonStatChanges,
      specifiedType: const FullType(BuiltList, [FullType(NatureDetailPokeathlonStatChangesInner)]),
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
            specifiedType: const FullType(StatSummary),
          ) as StatSummary;
          result.decreasedStat.replace(valueDes);
          break;
        case r'increased_stat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(StatSummary),
          ) as StatSummary;
          result.increasedStat.replace(valueDes);
          break;
        case r'likes_flavor':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BerryFlavorSummary),
          ) as BerryFlavorSummary;
          result.likesFlavor.replace(valueDes);
          break;
        case r'hates_flavor':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BerryFlavorSummary),
          ) as BerryFlavorSummary;
          result.hatesFlavor.replace(valueDes);
          break;
        case r'berries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(BerrySummary)]),
          ) as BuiltList<BerrySummary>;
          result.berries.replace(valueDes);
          break;
        case r'pokeathlon_stat_changes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(NatureDetailPokeathlonStatChangesInner)]),
          ) as BuiltList<NatureDetailPokeathlonStatChangesInner>;
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

