//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pokemon_shape_awesome_name.dart';
import 'package:openapi/src/model/pokemon_shape_name.dart';
import 'package:openapi/src/model/pokemon_species_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_shape_detail.g.dart';

/// PokemonShapeDetail
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [awesomeNames] - The \"scientific\" name of this Pokémon shape listed in different languages.
/// * [names] - The name of this resource listed in different languages.
/// * [pokemonSpecies] - A list of the Pokémon species that have this shape.
@BuiltValue()
abstract class PokemonShapeDetail implements Built<PokemonShapeDetail, PokemonShapeDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The \"scientific\" name of this Pokémon shape listed in different languages.
  @BuiltValueField(wireName: r'awesome_names')
  BuiltList<PokemonShapeAwesomeName> get awesomeNames;

  /// The name of this resource listed in different languages.
  @BuiltValueField(wireName: r'names')
  BuiltList<PokemonShapeName> get names;

  /// A list of the Pokémon species that have this shape.
  @BuiltValueField(wireName: r'pokemon_species')
  BuiltList<PokemonSpeciesSummary> get pokemonSpecies;

  PokemonShapeDetail._();

  factory PokemonShapeDetail([void updates(PokemonShapeDetailBuilder b)]) = _$PokemonShapeDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonShapeDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonShapeDetail> get serializer => _$PokemonShapeDetailSerializer();
}

class _$PokemonShapeDetailSerializer implements PrimitiveSerializer<PokemonShapeDetail> {
  @override
  final Iterable<Type> types = const [PokemonShapeDetail, _$PokemonShapeDetail];

  @override
  final String wireName = r'PokemonShapeDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonShapeDetail object, {
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
    yield r'awesome_names';
    yield serializers.serialize(
      object.awesomeNames,
      specifiedType: const FullType(BuiltList, [FullType(PokemonShapeAwesomeName)]),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(PokemonShapeName)]),
    );
    yield r'pokemon_species';
    yield serializers.serialize(
      object.pokemonSpecies,
      specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesSummary)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonShapeDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonShapeDetailBuilder result,
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
        case r'awesome_names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonShapeAwesomeName)]),
          ) as BuiltList<PokemonShapeAwesomeName>;
          result.awesomeNames.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonShapeName)]),
          ) as BuiltList<PokemonShapeName>;
          result.names.replace(valueDes);
          break;
        case r'pokemon_species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesSummary)]),
          ) as BuiltList<PokemonSpeciesSummary>;
          result.pokemonSpecies.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonShapeDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonShapeDetailBuilder();
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


