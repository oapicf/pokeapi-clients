//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/region_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:openapi/src/model/pokedex_name.dart';
import 'package:openapi/src/model/pokedex_description.dart';
import 'package:openapi/src/model/pokedex_detail_pokemon_entries_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokedex_detail.g.dart';

/// PokedexDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [isMainSeries] 
/// * [descriptions] 
/// * [names] 
/// * [pokemonEntries] 
/// * [region] 
/// * [versionGroups] 
@BuiltValue()
abstract class PokedexDetail implements Built<PokedexDetail, PokedexDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'is_main_series')
  bool? get isMainSeries;

  @BuiltValueField(wireName: r'descriptions')
  BuiltList<PokedexDescription> get descriptions;

  @BuiltValueField(wireName: r'names')
  BuiltList<PokedexName> get names;

  @BuiltValueField(wireName: r'pokemon_entries')
  BuiltList<PokedexDetailPokemonEntriesInner> get pokemonEntries;

  @BuiltValueField(wireName: r'region')
  RegionSummary get region;

  @BuiltValueField(wireName: r'version_groups')
  BuiltList<AbilityDetailPokemonInnerPokemon> get versionGroups;

  PokedexDetail._();

  factory PokedexDetail([void updates(PokedexDetailBuilder b)]) = _$PokedexDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokedexDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokedexDetail> get serializer => _$PokedexDetailSerializer();
}

class _$PokedexDetailSerializer implements PrimitiveSerializer<PokedexDetail> {
  @override
  final Iterable<Type> types = const [PokedexDetail, _$PokedexDetail];

  @override
  final String wireName = r'PokedexDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokedexDetail object, {
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
    if (object.isMainSeries != null) {
      yield r'is_main_series';
      yield serializers.serialize(
        object.isMainSeries,
        specifiedType: const FullType(bool),
      );
    }
    yield r'descriptions';
    yield serializers.serialize(
      object.descriptions,
      specifiedType: const FullType(BuiltList, [FullType(PokedexDescription)]),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(PokedexName)]),
    );
    yield r'pokemon_entries';
    yield serializers.serialize(
      object.pokemonEntries,
      specifiedType: const FullType(BuiltList, [FullType(PokedexDetailPokemonEntriesInner)]),
    );
    yield r'region';
    yield serializers.serialize(
      object.region,
      specifiedType: const FullType(RegionSummary),
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
    PokedexDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokedexDetailBuilder result,
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
        case r'is_main_series':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isMainSeries = valueDes;
          break;
        case r'descriptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokedexDescription)]),
          ) as BuiltList<PokedexDescription>;
          result.descriptions.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokedexName)]),
          ) as BuiltList<PokedexName>;
          result.names.replace(valueDes);
          break;
        case r'pokemon_entries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokedexDetailPokemonEntriesInner)]),
          ) as BuiltList<PokedexDetailPokemonEntriesInner>;
          result.pokemonEntries.replace(valueDes);
          break;
        case r'region':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RegionSummary),
          ) as RegionSummary;
          result.region.replace(valueDes);
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
  PokedexDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokedexDetailBuilder();
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

