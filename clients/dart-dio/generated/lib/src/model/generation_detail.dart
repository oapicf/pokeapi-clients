//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_summary.dart';
import 'package:openapi/src/model/region_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:openapi/src/model/generation_name.dart';
import 'package:openapi/src/model/type_summary.dart';
import 'package:openapi/src/model/ability_summary.dart';
import 'package:openapi/src/model/pokemon_species_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'generation_detail.g.dart';

/// GenerationDetail
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [abilities] - A list of abilities that were introduced in this generation.
/// * [mainRegion] - The main region travelled in this generation.
/// * [moves] - A list of moves that were introduced in this generation.
/// * [names] - The name of this resource listed in different languages.
/// * [pokemonSpecies] - A list of Pokémon species that were introduced in this generation.
/// * [types] - A list of types that were introduced in this generation.
/// * [versionGroups] - A list of version groups that were introduced in this generation.
@BuiltValue()
abstract class GenerationDetail implements Built<GenerationDetail, GenerationDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// A list of abilities that were introduced in this generation.
  @BuiltValueField(wireName: r'abilities')
  BuiltList<AbilitySummary> get abilities;

  /// The main region travelled in this generation.
  @BuiltValueField(wireName: r'main_region')
  RegionSummary get mainRegion;

  /// A list of moves that were introduced in this generation.
  @BuiltValueField(wireName: r'moves')
  BuiltList<MoveSummary> get moves;

  /// The name of this resource listed in different languages.
  @BuiltValueField(wireName: r'names')
  BuiltList<GenerationName> get names;

  /// A list of Pokémon species that were introduced in this generation.
  @BuiltValueField(wireName: r'pokemon_species')
  BuiltList<PokemonSpeciesSummary> get pokemonSpecies;

  /// A list of types that were introduced in this generation.
  @BuiltValueField(wireName: r'types')
  BuiltList<TypeSummary> get types;

  /// A list of version groups that were introduced in this generation.
  @BuiltValueField(wireName: r'version_groups')
  BuiltList<VersionGroupSummary> get versionGroups;

  GenerationDetail._();

  factory GenerationDetail([void updates(GenerationDetailBuilder b)]) = _$GenerationDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GenerationDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GenerationDetail> get serializer => _$GenerationDetailSerializer();
}

class _$GenerationDetailSerializer implements PrimitiveSerializer<GenerationDetail> {
  @override
  final Iterable<Type> types = const [GenerationDetail, _$GenerationDetail];

  @override
  final String wireName = r'GenerationDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GenerationDetail object, {
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
    yield r'abilities';
    yield serializers.serialize(
      object.abilities,
      specifiedType: const FullType(BuiltList, [FullType(AbilitySummary)]),
    );
    yield r'main_region';
    yield serializers.serialize(
      object.mainRegion,
      specifiedType: const FullType(RegionSummary),
    );
    yield r'moves';
    yield serializers.serialize(
      object.moves,
      specifiedType: const FullType(BuiltList, [FullType(MoveSummary)]),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(GenerationName)]),
    );
    yield r'pokemon_species';
    yield serializers.serialize(
      object.pokemonSpecies,
      specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesSummary)]),
    );
    yield r'types';
    yield serializers.serialize(
      object.types,
      specifiedType: const FullType(BuiltList, [FullType(TypeSummary)]),
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
    GenerationDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GenerationDetailBuilder result,
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
        case r'abilities':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilitySummary)]),
          ) as BuiltList<AbilitySummary>;
          result.abilities.replace(valueDes);
          break;
        case r'main_region':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(RegionSummary),
          ) as RegionSummary;
          result.mainRegion.replace(valueDes);
          break;
        case r'moves':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveSummary)]),
          ) as BuiltList<MoveSummary>;
          result.moves.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(GenerationName)]),
          ) as BuiltList<GenerationName>;
          result.names.replace(valueDes);
          break;
        case r'pokemon_species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesSummary)]),
          ) as BuiltList<PokemonSpeciesSummary>;
          result.pokemonSpecies.replace(valueDes);
          break;
        case r'types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TypeSummary)]),
          ) as BuiltList<TypeSummary>;
          result.types.replace(valueDes);
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
  GenerationDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GenerationDetailBuilder();
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


