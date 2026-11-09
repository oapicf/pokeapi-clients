//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/region_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:openapi/src/model/pokedex_name.dart';
import 'package:openapi/src/model/pokemon_dex_number.dart';
import 'package:openapi/src/model/pokedex_description.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokedex_detail.g.dart';

/// PokedexDetail
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [isMainSeries] - Whether or not this Pokédex originated in the main series of the video games.
/// * [descriptions] - The description of this resource listed in different languages.
/// * [names] - The name of this resource listed in different languages.
/// * [pokemonEntries] - A list of Pokémon catalogued in this Pokédex and their indexes.
/// * [region] - The region this Pokédex catalogues Pokémon for.
/// * [versionGroups] - A list of version groups this Pokédex is relevant to.
@BuiltValue()
abstract class PokedexDetail implements Built<PokedexDetail, PokedexDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// Whether or not this Pokédex originated in the main series of the video games.
  @BuiltValueField(wireName: r'is_main_series')
  bool? get isMainSeries;

  /// The description of this resource listed in different languages.
  @BuiltValueField(wireName: r'descriptions')
  BuiltList<PokedexDescription> get descriptions;

  /// The name of this resource listed in different languages.
  @BuiltValueField(wireName: r'names')
  BuiltList<PokedexName> get names;

  /// A list of Pokémon catalogued in this Pokédex and their indexes.
  @BuiltValueField(wireName: r'pokemon_entries')
  BuiltList<PokemonDexNumber> get pokemonEntries;

  /// The region this Pokédex catalogues Pokémon for.
  @BuiltValueField(wireName: r'region')
  RegionSummary? get region;

  /// A list of version groups this Pokédex is relevant to.
  @BuiltValueField(wireName: r'version_groups')
  BuiltList<VersionGroupSummary> get versionGroups;

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
      specifiedType: const FullType(BuiltList, [FullType(PokemonDexNumber)]),
    );
    yield r'region';
    yield object.region == null ? null : serializers.serialize(
      object.region,
      specifiedType: const FullType.nullable(RegionSummary),
    );
    yield r'version_groups';
    yield serializers.serialize(
      object.versionGroups,
      specifiedType: const FullType(BuiltList, [FullType(VersionGroupSummary)]),
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
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
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
            specifiedType: const FullType(BuiltList, [FullType(PokemonDexNumber)]),
          ) as BuiltList<PokemonDexNumber>;
          result.pokemonEntries.replace(valueDes);
          break;
        case r'region':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(RegionSummary),
          ) as RegionSummary?;
          if (valueDes == null) continue;
          result.region.replace(valueDes);
          break;
        case r'version_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(VersionGroupSummary)]),
          ) as BuiltList<VersionGroupSummary>;
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


