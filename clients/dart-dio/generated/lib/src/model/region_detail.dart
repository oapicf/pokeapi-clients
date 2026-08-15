//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/region_name.dart';
import 'package:openapi/src/model/pokedex_summary.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:openapi/src/model/generation_summary.dart';
import 'package:openapi/src/model/location_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'region_detail.g.dart';

/// RegionDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [locations] 
/// * [mainGeneration] 
/// * [names] 
/// * [pokedexes] 
/// * [versionGroups] 
@BuiltValue()
abstract class RegionDetail implements Built<RegionDetail, RegionDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'locations')
  BuiltList<LocationSummary> get locations;

  @BuiltValueField(wireName: r'main_generation')
  GenerationSummary get mainGeneration;

  @BuiltValueField(wireName: r'names')
  BuiltList<RegionName> get names;

  @BuiltValueField(wireName: r'pokedexes')
  BuiltList<PokedexSummary> get pokedexes;

  @BuiltValueField(wireName: r'version_groups')
  BuiltList<AbilityDetailPokemonInnerPokemon> get versionGroups;

  RegionDetail._();

  factory RegionDetail([void updates(RegionDetailBuilder b)]) = _$RegionDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RegionDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RegionDetail> get serializer => _$RegionDetailSerializer();
}

class _$RegionDetailSerializer implements PrimitiveSerializer<RegionDetail> {
  @override
  final Iterable<Type> types = const [RegionDetail, _$RegionDetail];

  @override
  final String wireName = r'RegionDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RegionDetail object, {
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
    yield r'locations';
    yield serializers.serialize(
      object.locations,
      specifiedType: const FullType(BuiltList, [FullType(LocationSummary)]),
    );
    yield r'main_generation';
    yield serializers.serialize(
      object.mainGeneration,
      specifiedType: const FullType(GenerationSummary),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(RegionName)]),
    );
    yield r'pokedexes';
    yield serializers.serialize(
      object.pokedexes,
      specifiedType: const FullType(BuiltList, [FullType(PokedexSummary)]),
    );
    yield r'version_groups';
    yield serializers.serialize(
      object.versionGroups,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    RegionDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RegionDetailBuilder result,
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
        case r'locations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LocationSummary)]),
          ) as BuiltList<LocationSummary>;
          result.locations.replace(valueDes);
          break;
        case r'main_generation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GenerationSummary),
          ) as GenerationSummary;
          result.mainGeneration.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(RegionName)]),
          ) as BuiltList<RegionName>;
          result.names.replace(valueDes);
          break;
        case r'pokedexes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokedexSummary)]),
          ) as BuiltList<PokedexSummary>;
          result.pokedexes.replace(valueDes);
          break;
        case r'version_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.versionGroups.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RegionDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RegionDetailBuilder();
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

